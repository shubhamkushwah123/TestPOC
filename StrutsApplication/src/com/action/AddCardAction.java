package com.action;

import com.models.AddCardModel;
import com.service.AddCardService;

public class AddCardAction {
	
	AddCardService asc = new AddCardService();
	AddCardModel asm = new AddCardModel();
	
	
	public String execute()
	{
		
		
		return "SUCCESS";
	}
		/*asm.setCardId(cardId);
		asm.setBankName(bankName);
		asm.setCardType(cardType);
		asm.setDueDate(dueDate);
		asm.setOutstanding(outstanding);
		asm.setStatementGenerationDate(statementGenerationDate);
		if(asc.addCard(asm))
		{
			message="Card has been successfully added";
		return "success";
		}
		else
		return "failure";
	}*/
	
	
	String cardId;
	String bankName;
	String cardType;
	String outstanding;
	String dueDate;
	String statementGenerationDate;
	String message;
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getOutstanding() {
		return outstanding;
	}
	public void setOutstanding(String outstanding) {
		this.outstanding = outstanding;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getStatementGenerationDate() {
		return statementGenerationDate;
	}
	public void setStatementGenerationDate(String statementGenerationDate) {
		this.statementGenerationDate = statementGenerationDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
