package com.beauty.parlour.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Appointment {

@Id  @GeneratedValue	
private int Id;

private String appointmentDate;

private int appointmentSlotId;

public String appointmentSlot;

private String username;

@Transient
private boolean status;
@Transient
public String getAppointmentButton;
@Transient
public String bookAppointmentButton;



public String getGetAppointmentButton() {
	return getAppointmentButton;
}

public void setGetAppointmentButton(String getAppointmentButton) {
	this.getAppointmentButton = getAppointmentButton;
}

public String getBookAppointmentButton() {
	return bookAppointmentButton;
}

public void setBookAppointmentButton(String bookAppointmentButton) {
	this.bookAppointmentButton = bookAppointmentButton;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getAppointmentDate() {
	return appointmentDate;
}

public void setAppointmentDate(String appointmentDate) {
	this.appointmentDate = appointmentDate;
}

public int getAppointmentSlotId() {
	return appointmentSlotId;
}

public void setAppointmentSlotId(int appointmentSlotId) {
	this.appointmentSlotId = appointmentSlotId;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}



public String getAppointmentSlot() {
	return appointmentSlot;
}

public void setAppointmentSlot(String appointmentSlot) {
	this.appointmentSlot = appointmentSlot;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}

public Appointment(int id, String slot, String date)
{
	this.appointmentSlotId = id;
	this.appointmentSlot = slot;
	this.appointmentDate = date;
}

public Appointment()
{
	
}
}
