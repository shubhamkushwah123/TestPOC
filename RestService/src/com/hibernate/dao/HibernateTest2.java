package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.User;
import com.model.Vehicle;

public class HibernateTest2 {
	
	public static void main(String args[])
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		User user = new User("Shubham Singh Kushwah");
		Vehicle vehicle1 = new Vehicle("Two Wheeler - Fazer");
		Vehicle vehicle2 = new Vehicle("Let's go, in our Alto");
		
		user.getVehicle().add(vehicle1);
		user.getVehicle().add(vehicle2);
	
		session.beginTransaction();
		
		session.save(user);	
		session.save(vehicle1);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();
	}

}
