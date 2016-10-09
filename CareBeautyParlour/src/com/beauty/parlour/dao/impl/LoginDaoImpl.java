package com.beauty.parlour.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import com.beauty.parlour.models.Member;

public class LoginDaoImpl {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public Member getUser(Member login)
	{
		Member fetchedMember = new Member();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Member.class);
		cr.add(Restrictions.eq("username", login.getUsername()));
		cr.add(Restrictions.eq("password", login.getPassword()));
		List results = cr.list();
		if(results!=null)
		fetchedMember = (Member)results.get(0);
		System.out.println("fetched Member"+ fetchedMember.getUsername());
		return fetchedMember;
	}

	public Member getDetails(Member login) {
		// TODO Auto-generated method stub

		Member fetchedMember = new Member();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Member.class);
		cr.add(Restrictions.eq("username", login.getUsername()));
		cr.add(Restrictions.eq("password", login.getPassword()));
		List results = cr.list();
		if(results!=null)
		fetchedMember = (Member)results.get(0);
		else
		System.out.println("member does not exist !");
		System.out.println("fetched Member"+ fetchedMember.getUsername());
		return fetchedMember;
	
	}

	public void updateDetails(Member member) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		try
		{
		session.beginTransaction();
		session.update(member);
		session.getTransaction().commit();
		//member = null;
		//member = (Member)session.get(Member.class, 1);
		//System.out.println(member.getUsername());
		}catch(Exception e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			
			session.close();
		}}
		
	}
	
	


