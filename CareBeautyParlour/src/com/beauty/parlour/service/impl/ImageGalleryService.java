package com.beauty.parlour.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.beauty.parlour.dao.impl.ImageGalleryDaoImpl;
import com.beauty.parlour.models.Image;

public class ImageGalleryService {

	public ArrayList<Image> getImages(String category) {
		// TODO Auto-generated method stub
		ImageGalleryDaoImpl  galleryDaoImpl = new ImageGalleryDaoImpl();
		ArrayList<Image> imageList = new ArrayList<Image>();
	
		imageList = galleryDaoImpl.getImages(category);
		if(imageList!=null){
		return imageList;
		}
		else{
			System.out.println("No Image Found");
			return null;
		}
		
	}

}
