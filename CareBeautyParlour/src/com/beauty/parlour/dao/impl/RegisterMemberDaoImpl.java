package com.beauty.parlour.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.beauty.parlour.models.Member;

public class RegisterMemberDaoImpl {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	
	List<Member> allMembers = null;
	
	public void saveUser(Member member) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		try
		{
		session.beginTransaction();
		session.save(member);
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
	
	
	



