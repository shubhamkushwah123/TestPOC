package com.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import com.business.service.MessageService;
import com.model.Message;
import javax.ws.rs.QueryParam;

@Path("/messages")
public class RestService {

	MessageService mservice = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage(@QueryParam("year") int year)
	{
		if(year>0)
		{
			return mservice.getAllMessagesForYear(year);
		}
		return mservice.getAllMessages();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
		return mservice.addMessage(message);
	}
	
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") Long messageId)
	{
		return mservice.getMessage(messageId);
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message UpdateMessage(@PathParam("messageId") long messageId, Message message)
	{
		message.setMessageId(messageId);
		return mservice.UpdateMessage(message);
	}
	
	
	
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource()
	{
		return new CommentResource();
		//return new CommentResource();
	}
	
		
	

}
