package com.beauty.parlour.actions;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.beauty.parlour.models.Image;
import com.beauty.parlour.service.impl.ImageGalleryService;
import com.opensymphony.xwork2.ModelDriven;

public class ImageGalleryAction implements ModelDriven<List<Image>>, ServletRequestAware, ServletResponseAware{

	private ArrayList<Image> imageList ;
	
	private HttpServletRequest request;
	
	private HttpServletResponse response;
	
	private String action;

	public String execute() throws IOException{
	
		ImageGalleryService galleryService = new ImageGalleryService();
		HttpSession session=request.getSession(); 
		imageList = new ArrayList<Image>();
		System.out.println(action);
		if(action!=null)
		{
			ArrayList<Image> tempList = new ArrayList<Image>();
			tempList = galleryService.getImages(action);
			for (Image img : tempList)
			{
			String filePath = request.getSession().getServletContext().getRealPath("/");
			System.out.println(filePath);
			//img.setImagePath(filePath + img.getImageCaption() + ".JPG");
			img.setImageCaption(img.getImageCaption() + ".jpg");
			System.out.println(img.getImagePath());
			imageList.add(img);
			}
			
			return "success";
		}
		else
		{
			return "input";
		}
		
		
	}
	
	
	public ArrayList<Image> getImageList() {
		return imageList;
	}

	public void setImageList(ArrayList<Image> imageList) {
		this.imageList = imageList;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	@Override
	public List<Image> getModel() {
		// TODO Auto-generated method stub
		return (ArrayList<Image>)imageList;
	}


	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
		
	}


	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		response=arg0;
	}
	
	

}
