package com.model;

import java.util.Date;

public class Profile {
	
	Long id;
	String profileName;
	String username;
	String createdOn;
	
	public Profile()
	{
		
	}
	public Profile(Long id, String profileName,String username)
	{
		this.id=id;
		this.profileName=profileName;
		this.username=username;
		createdOn = new Date().toString();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	

}
