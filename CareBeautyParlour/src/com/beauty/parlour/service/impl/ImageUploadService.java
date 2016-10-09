package com.beauty.parlour.service.impl;

import com.beauty.parlour.dao.impl.ImageUploadDaoImpl;
import com.beauty.parlour.models.Image;

public class ImageUploadService {

	public void saveImage(Image img) {
		// TODO Auto-generated method stub
		ImageUploadDaoImpl uploadDao = new ImageUploadDaoImpl();
		uploadDao.saveImage(img);
		
	}

}
