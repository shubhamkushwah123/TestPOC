package com.beauty.parlour.actions;
import org.apache.commons.lang.StringUtils;


import com.beauty.parlour.models.Member;
import com.beauty.parlour.service.impl.LoginServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<Member> {
	
	
	Member member =new Member();
	
	public String action;
	
	
	public void validate(){
		
		if (StringUtils.isEmpty(member.getUsername())){
			addFieldError("username", "username can not be blank");
		}
		
		if (StringUtils.isEmpty(member.getPassword())){
			addFieldError("password", "password can not be blank");
		}
	}
	
	
	public String execute()
	{
		LoginServiceImpl loginService  = new LoginServiceImpl();
		
		if(action.equalsIgnoreCase("login"))
		{
			loginService.verifyUser(member);
			return "success";
		}
		else if(action.equalsIgnoreCase("update"))
		{
			System.out.println(member.getUsername());
			member = loginService.getUser(member);
			System.out.println("member recieved for "+member.getEmail());
			return "update";	
		}
	
		else
		{
			return "failure";
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
