package com.beauty.parlour.service.impl;

import java.util.List;

import com.beauty.parlour.dao.impl.RegisterMemberDaoImpl;
import com.beauty.parlour.models.Member;

public class RegisterMemberServiceImpl {

	public void registerUser(Member member) {
		// TODO Auto-generated method stub
		
		RegisterMemberDaoImpl registerDao = new RegisterMemberDaoImpl();
		System.out.println("Calling registerDao");
		registerDao.saveUser(member);
		System.out.println("Member Registered");
	}
	
 public void updateUser(Member member) {
	
	 RegisterMemberDaoImpl registerDao = new RegisterMemberDaoImpl();
	 registerDao.updateDetails(member);
}

}
