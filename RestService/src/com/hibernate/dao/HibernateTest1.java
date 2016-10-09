package com.hibernate.dao;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Message;
import com.model.UserDetails;

public class HibernateTest1 {
	
	public static void main(String args[])
	{
		UserDetails user = new UserDetails();
		user.setUserName("Shubham");
		Address adres1 = new Address("Ujjain","456001","MP");
		Address adres2 = new Address("Indore","400601","UP");
		//Message message = new Message("Shubham Singh", "Kushwah");
		
		user.getListOfAddress().add(adres1);
		user.getListOfAddress().add(adres2);
		
		//It takes the hibernate.cfg and initialise SessionFactory();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		// It created a session object from Session factory
		 Session session =  sessionFactory.openSession();
		try{
		
		 // Transaction defines a single unit of work with Database.
		 session.beginTransaction();
		 // It saves the user into the database. 
		 session.save(user);
		// session.save(message);
		 session.getTransaction().commit();
		 System.out.println("Insertion done");
		 user = null;
		 session.beginTransaction();
		 user = (UserDetails)session.get(UserDetails.class, 1);
		 System.out.println("User is fetched"+ user.getUserName());
		 session.close();
		}catch(Exception e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
			session.close();
		}
	}
}
