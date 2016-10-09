package com.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.model.Comment;
import com.business.service.CommentSerivice;

@Path("/")
public class CommentResource {
	
CommentSerivice service = new CommentSerivice();

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Comment> getAllComments(@PathParam("messageId") long messageId)
{
	return service.getAllComments(messageId);
}


@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Comment addComment(@PathParam("messageId") long messageId, Comment comment)
{
	return service.addComment(messageId, comment);
}


@PUT
@Path("/{commentId}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Comment updateComment(@PathParam("messageId") long messageId,
							 @PathParam("commentId") int commentId,
							 Comment comment)
{
	return service.updateComment(messageId,commentId,comment);
}

}

