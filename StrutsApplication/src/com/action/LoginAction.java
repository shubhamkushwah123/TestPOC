package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	String username;
	String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(username.equalsIgnoreCase(""))	{
			addFieldError("username", "username can not be empty");
		}
		if(password.equalsIgnoreCase(""))	{
			addFieldError("password"," password can not be empty");
		}
	}
	
	
	public String execute()
	{
		if(username.equals("shubham") && password.equals("kushwah"))
				{
					return SUCCESS;
				}
		
		addActionMessage("Username & password doesn't match");
		addFieldError("message", "Username & Password does not match !!!");
		return INPUT;
	}

}
