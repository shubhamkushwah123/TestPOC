package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Message;

/**
 * @author SHUBHAM
 *
 */
public class MessageDao {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	/*
	 * This method takes messageId as input and fetches the complete message 
	 * corresponding to that input messageId and return it to service Layer.
	 */
	public Message getMessage(Long messageId) {
		Message message = null;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try
		{
			message = (Message)session.get(Message.class, messageId);
		
		}catch(Exception e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			session.close();
		}

		return message;
	}

	
	// It inserts a message into database
	public Message insertMessage(Message message) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		try{
		session.beginTransaction();
		session.save(message);
		}catch(Exception e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			session.close();
		}
		return message;
	}


	

	public Message updateMessageDB(Message message) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		try{
			session.beginTransaction();
			session.update(message);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			session.close();
		}
		return message;
	}


	

}
