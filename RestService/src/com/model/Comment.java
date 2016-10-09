package com.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comment {
	
	int id;
	long messageId;
	String comment;
	Date commentDate;
	
	public Comment()
	{
	
	}
	
	public Comment(int id, long messageId, String comment)
	{
		this.id=id;
		this.messageId=messageId;
		this.comment=comment;
		this.commentDate=new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}


}
