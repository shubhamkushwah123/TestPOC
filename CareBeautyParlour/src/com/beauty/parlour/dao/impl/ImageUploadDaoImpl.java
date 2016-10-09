package com.beauty.parlour.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.beauty.parlour.models.Image;

public class ImageUploadDaoImpl {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public void saveImage(Image img) {
		// TODO Auto-generated method stub
	
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		try{
		session.save(img);
		
		session.getTransaction().commit();
		}catch(Exception e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			session.close();
		}
		
	}

}
