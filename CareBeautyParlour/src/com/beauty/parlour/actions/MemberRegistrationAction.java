package com.beauty.parlour.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.beauty.parlour.models.Member;
import com.beauty.parlour.service.impl.RegisterMemberServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MemberRegistrationAction extends ActionSupport implements ModelDriven<Member> {
	
	 private Member member = new Member();
	 private String action;

		public void validate(){
			
			if (StringUtils.isEmpty(member.getFirstName()) || (member.getFirstName()==null)){
				addFieldError("firstName", "First Name can not be blank");
			}
			if (StringUtils.isEmpty(member.getLastName())){
				addFieldError("lastName", " Last Name can not be blank");
			}
			if (StringUtils.isEmpty(member.getEmail())){
				addFieldError("email", "e-mail can not be blank");
			}
			if (StringUtils.isEmpty(member.getAge())){
				addFieldError("age", "age can not be blank");
			}
			if (StringUtils.isEmpty(member.getContact())){
				addFieldError("contact", "Contact can not be blank");
			}
			if (StringUtils.isEmpty(member.getUsername())){
				addFieldError("username", "username can not be blank");
			}
			if (StringUtils.isEmpty(member.getPassword())){
				addFieldError("password", "password can not be blank");
			}
		}
	public String execute()
	{
		System.out.println(member.getUsername().toString());
		RegisterMemberServiceImpl  registerService = new RegisterMemberServiceImpl();
		System.out.println("Calling Register Service");
		
	  if (action.equalsIgnoreCase("update"))
		{
			// code for update (call update method of service)
			registerService.updateUser(member);
			
			return "update";
		}
	  
	else if(action.equalsIgnoreCase("register")){
		registerService.registerUser(member);
		return "success";
		
		}
	else {
		
		return"failure";
	}
	}



	public Member getMember() {
		return member;
	}



	public void setMember(Member member) {
		this.member = member;
	}



	public String getAction() {
		return action;
	}



	public void setAction(String action) {
		this.action = action;
	}



	@Override
	public Member getModel() {
		// TODO Auto-generated method stub
		return member;
	}

	
}
