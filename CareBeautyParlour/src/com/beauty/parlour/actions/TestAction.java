package com.beauty.parlour.actions;

import com.beauty.parlour.models.Member;

public class TestAction {
	
	Member member = new Member();
	
	String message = "Welcome !!! ";
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String execute()
	{
		if(member.getUsername().equalsIgnoreCase("Jyoti"))
		{
			
			return "success";
		}
		return "failure";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
