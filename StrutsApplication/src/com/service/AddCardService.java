package com.service;

import com.models.AddCardModel;

public class AddCardService {
	
	public boolean addCard(AddCardModel asm)
	{
		if(asm.equals(null))
		{
			return false;
		}
		System.out.println("Card with ID "+ asm.getCardId().toString() +"has been added successfully" );
	
		return true;
	}

}
