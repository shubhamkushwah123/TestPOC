package com.beauty.parlour.actions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.beauty.parlour.models.Appointment;
import com.beauty.parlour.service.impl.AppointmentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BookAppointmentAction implements ModelDriven<List<Appointment>>{
	
	Date selectDate = new Date();
	
	private String action;
	
	private String chosenSlotId;
	
	List<Appointment> appointmentList = null;
	
	AppointmentServiceImpl appointmentService = new AppointmentServiceImpl();
	
	public String execute()
	{
		Appointment appointment = new Appointment();
		
		appointmentList = new ArrayList<Appointment>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String dateInString = sdf.format(selectDate);
		
			
		appointment.setAppointmentDate(dateInString);
		
		
		
		if(action.equalsIgnoreCase("getAppointment")){
		appointmentList = appointmentService.getAppointmentforDate(dateInString);
		return "get";
		}
		else if(action.equalsIgnoreCase("BOOK")){
		appointment.setAppointmentSlotId(Integer.parseInt(chosenSlotId));
		appointmentService.bookAppointment(appointment);
		return "book";
		}
		else if (action.equalsIgnoreCase("CANCEL")) {
		appointment.setAppointmentSlotId(Integer.parseInt(chosenSlotId));
		appointmentService.cancelAppointment(appointment);
		return "cancel";
		}
		else {
			return "failure";
		}
		
	}
	
	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public Date getSelectDate() {
		return selectDate;
	}

	public void setSelectDate(Date selectDate) {
		this.selectDate = selectDate;
	}

	public String getChosenSlotId() {
		return chosenSlotId;
	}

	public void setChosenSlotId(String chosenSlotId) {
		this.chosenSlotId = chosenSlotId;
	}

	@Override
	public List<Appointment> getModel() {
		// TODO Auto-generated method stub
		return appointmentList;
	}
	

}
