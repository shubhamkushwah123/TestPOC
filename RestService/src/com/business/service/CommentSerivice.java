package com.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.database.StaticDatabase;
import com.model.Comment;

public class CommentSerivice {
	
	private Map<Integer,Comment> comments = StaticDatabase.getComments();
	
	public CommentSerivice()
	{
		comments.put(1, new Comment(1, 1, "Very nice Machi"));
		comments.put(2, new Comment(2, 1, "Amazing pic machi"));
	}

	public List<Comment> getAllComments(long messageId)
	{
		ArrayList<Comment> commentList = new ArrayList<Comment>();
		//for(Comment comment : commentList){
		for(int i=1;i<=comments.size();i++)
		{
			Comment comment = (Comment)comments.get(i);
			if(comment.getMessageId()==messageId)
			{
				commentList.add(comment);
			}
		}
		
		return commentList;
	}
	
	public Comment getComment(int commentId)
	{
		return comments.get(commentId);
	}
	
	public Comment addComment(long messageId, Comment comment)
	{
		int commentId=comments.size()+1;
		comment.setId(commentId);
		comment.setMessageId(messageId);
		comments.put(commentId,comment);
		return comments.get(commentId);
				
	}
	
	public Comment updateComment(long messageId, int commentId,Comment comment)
	{
		//Comment temp = comments.put(comment.getId(), comment);
		comment.setMessageId(messageId);
		comment.setId(commentId);
		comments.put(commentId, comment);
		return comment;
	}
	public Comment delete(int commentId)
	{
		return comments.remove(commentId);
	}
	
}
