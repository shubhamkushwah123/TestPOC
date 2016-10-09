package com.beauty.parlour.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.beauty.parlour.models.Appointment;
import com.beauty.parlour.models.Image;

public class ImageGalleryDaoImpl {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public ArrayList<Image> getImages(String category) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		
		Criteria cr = session.createCriteria(Image.class);
		
		ArrayList<Image> imageList = new ArrayList<Image>();
		
		cr.add(Restrictions.eq("imageCategory", category));
		
		List results = cr.list();
		
		session.close();
		
		if(results.size()>0)
			return (ArrayList<Image>)results;
		else
			return null;
	}

}
