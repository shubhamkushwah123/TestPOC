package com.model;

import java.util.Date;







import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement
public class Message {
	@Id @GeneratedValue
	private Long messageId;
	private String message;
	private String author;
	@Temporal (TemporalType.DATE)
	private Date createdOn;
	
	
	public Message()
	{
		
	}
	public Message(Long messageId, String message,String author)
	{
		this.messageId=messageId;
		this.message=message;
		this.author=author;
		this.createdOn=new Date();
	}
	
	public Message(String message, String author)
	{
		this.message=message;
		this.author=author;
		this.createdOn=new Date();
	}
	
		public Long getMessageId() {
			return messageId;
		}
		public void setMessageId(Long messageId) {
			this.messageId = messageId;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public Date getCreatedOn() {
			return createdOn;
		}
		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}
	
}
