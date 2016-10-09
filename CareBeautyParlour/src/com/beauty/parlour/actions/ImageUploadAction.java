package com.beauty.parlour.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.beauty.parlour.models.Image;
import com.beauty.parlour.service.impl.ImageUploadService;
import com.opensymphony.xwork2.ActionSupport;

public class ImageUploadAction extends ActionSupport implements ServletRequestAware {

	private File image;
	private String imageCaption;
	private String imageCategory;
	HttpServletRequest request;
	
	
	public String execute() throws IOException
	{
		String filePath = request.getSession().getServletContext().getRealPath("/").concat("Images\\");
		System.out.println(filePath);
		File fileToCreate = new File(filePath, imageCaption +".jpg"); 
		System.out.println(fileToCreate.getName());
		FileUtils.copyFile(image, fileToCreate); 
		String location = filePath + imageCaption + ".jpg";
		FileInputStream fin = new FileInputStream(image);
		byte[] imageArray = new byte[(int)image.length()];
		fin.read(imageArray);
		fin.close();
		Image img = new Image();
		img.setImage(imageArray);
		img.setImageCaption(imageCaption);
		img.setImageCategory(imageCategory);
		img.setImagePath(location);
		try {
			ImageUploadService uploadService = new ImageUploadService();
			uploadService.saveImage(img);
			} 
			catch (Exception e) {
				System.out.println(e);
				return INPUT;
     }

     return SUCCESS;
	}
	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getImageCaption() {
		return imageCaption;
	}

	public void setImageCaption(String imageCaption) {
		this.imageCaption = imageCaption;
	}

	public String getImageCategory() {
		return imageCategory;
	}

	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
	}
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
	}
	
	

}
