package com.beauty.parlour.service.impl;

import com.beauty.parlour.dao.impl.LoginDaoImpl;
import com.beauty.parlour.dao.impl.RegisterMemberDaoImpl;
import com.beauty.parlour.models.Member;

public class LoginServiceImpl {
	
	
	public boolean verifyUser(Member login)
	{
		LoginDaoImpl loginDao = new LoginDaoImpl();
		Member member = loginDao.getUser(login);
		if(member!=null)
		{
			System.out.println("Login Successful for User" + member.getFirstName());
			
			return true;
		}
		else
		{
			System.out.println("Login Failed");
			return false;
		}
	}

	public Member getUser(Member login) {
		// TODO Auto-generated method stub
		LoginDaoImpl loginDao = new LoginDaoImpl();
		Member member =loginDao.getDetails(login);
		return member;
	}

	public void updateUser(Member member) {
		// TODO Auto-generated method stub
		 LoginDaoImpl loginDao = new LoginDaoImpl();
		 loginDao.updateDetails(member);
		
	}
	

	
}
