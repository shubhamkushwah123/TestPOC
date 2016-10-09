package com.action;

import java.util.ArrayList;




import com.models.Pagination;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PaginationAction extends ActionSupport implements ModelDriven{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5775743470204158473L;
	
	ArrayList<Pagination> pageList = new ArrayList<Pagination>();
	
	public ArrayList<Pagination> getPageList() {
		return pageList;
	}

	public void setPageList(ArrayList<Pagination> pageList) {
		this.pageList = pageList;
	}

	public String execute()
	{
		
		for(int i=0;i<10;i++)
		{
			String firstName = "shubham"+i;
			String lastName = "kushwah"+i;
			Pagination pagination = new Pagination();
			pagination.setFirstName(firstName);
			pagination.setLastName(lastName);
			pageList.add(pagination);
		}
		return "success";
	}

	@Override
	public ArrayList<Pagination> getModel() {
		// TODO Auto-generated method stub
		return pageList;
	}

}
