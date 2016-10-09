package com.beauty.parlour.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.beauty.parlour.dao.impl.AppointmentDaoImpl;
import com.beauty.parlour.models.Appointment;

public class AppointmentServiceImpl {
	
	 private static HashMap<Integer, Appointment> timeSlots = new HashMap();
	
	 AppointmentDaoImpl appointmentDao = new AppointmentDaoImpl();
	 
	public static HashMap getSlots(String date)
	{
		timeSlots.put(1,new Appointment(1,"10:00-11:00",date));
		timeSlots.put(2,new Appointment(2,"11:00-12:00",date));
		timeSlots.put(3,new Appointment(3,"12:00-13:00",date));
		timeSlots.put(4,new Appointment(4,"13:00-14:00",date));
		timeSlots.put(5,new Appointment(5,"14:00-15:00",date));
		timeSlots.put(6,new Appointment(6,"15:00-16:00",date));
		timeSlots.put(7,new Appointment(7,"16:00-17:00",date));
		timeSlots.put(8,new Appointment(8,"17:00-18:00",date));
		return timeSlots ;
	}
	
	public Appointment bookAppointment(Appointment appointment){
		getSlots(appointment.getAppointmentDate());
		Appointment temp = timeSlots.get(appointment.getAppointmentSlotId());
		appointment.setAppointmentSlot(temp.getAppointmentSlot());
		appointment.setUsername("Jyoti");
		appointmentDao.bookAppointment(appointment);
		System.out.println("Appointment Booked by User" + appointment.getUsername());
		return appointment;
	}
	
	public Appointment cancelAppointment(Appointment appointment){
		appointmentDao.cancelAppointment(appointment);
		
		return appointment;
	}
	
	public ArrayList<Appointment> getAppointmentforDate(String date){
		
	ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	
	List<Appointment> listFromTable = new ArrayList<Appointment>();
	
	HashMap<Integer, Appointment> timeSlotsMap = getSlots(date);
	
	listFromTable = appointmentDao.getAppointmentListFromTable(date);
	
	appointmentList = generateList(listFromTable, timeSlotsMap);
	
	return appointmentList;
	
	}

	public ArrayList<Appointment> generateList(List<Appointment> listFromTable,
			HashMap<Integer, Appointment> timeSlotsMap) {
		 
		//appointmentList = (List<Appointment>)timeSlotsMap.values();
		if(listFromTable!=null){
			for(Appointment appointment: listFromTable)
			{
				if(timeSlotsMap.containsKey(appointment.getAppointmentSlotId())){
					appointment.setStatus(true);
					timeSlotsMap.put(appointment.getAppointmentSlotId(), appointment);
				}
			}
		}
		return new ArrayList<Appointment>(timeSlotsMap.values());
		
	}
	
	}

