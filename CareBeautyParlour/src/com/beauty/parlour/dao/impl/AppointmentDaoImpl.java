package com.beauty.parlour.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.beauty.parlour.models.Appointment;
import com.beauty.parlour.models.Member;

public class AppointmentDaoImpl {
	
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public List<Appointment> getAppointmentListFromTable(String date) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		
		Criteria cr = session.createCriteria(Appointment.class);
		
		List<Appointment> appointmentListFromTable = new ArrayList<Appointment>();
		
		cr.add(Restrictions.eq("appointmentDate", date));
		
		List results = cr.list();
		
		session.close();
		
		if(results.size()>0)
			return (List<Appointment>)results;
		else
			return null;
		
	}
	
	public boolean bookAppointment(Appointment appointment)
	{
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
	try{

		session.save(appointment);
		
		session.getTransaction().commit();
	
		session.close();
		
		return true;
		
	}catch(Exception e)
	{
		e.printStackTrace();
		session.getTransaction().rollback();
		session.close();
		return false;
	}
	
	}

	public void cancelAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Criteria cr = session.createCriteria(Appointment.class);
		
		List<Appointment> appointmentListFromTable = new ArrayList<Appointment>();
		
		cr.add(Restrictions.eq("appointmentDate", appointment.getAppointmentDate()));
		cr.add(Restrictions.eq("appointmentSlotId", appointment.getAppointmentSlotId()));
		
		List results = cr.list();
		
		Appointment temp = new Appointment();
		
		if(results.size()>0)
		{
			temp = (Appointment)results.get(0);
			try{
			session.delete(temp);
			session.getTransaction().commit();
			System.out.println("Appointment Cancelled" + temp.getAppointmentSlot());
			}catch(Exception e)
			{
				session.getTransaction().rollback();
			}
			finally
			{
				session.close();
			}

		}
		
		
	}
	
	
	
	
}
