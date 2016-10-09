package com.beauty.parlour.models;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Image {
	
	@Id @GeneratedValue
	private int imageId;
	
	private String imagePath;
	
	private String imageCaption;
	
	private String imageCategory;
	
	private byte[] image;

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	

}
