package com.business.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.database.StaticDatabase;
import com.hibernate.dao.MessageDao;
import com.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = StaticDatabase.getMessages();
	
	MessageDao messageDao = new MessageDao();
	
	public MessageService()
	{
		messages.put(1l, new Message(1l,"Hello World","Shubham"));
		messages.put(2l, new Message(2l,"Hello Jersey","Shubham"));
	}
	//Message message1 = new Message(1l,"Hello World","shubham");
	//Message message2 = new Message(2l,"Hello Jersey","shubham");
	//List<Message> messageList = new LinkedList<>();
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	public List<Message> getAllMessagesForYear(int year)
	{
		List<Message> messageListForYear=new ArrayList<Message>();
		Calendar calendar = Calendar.getInstance();
		for(Message message: messages.values())
			{
			calendar.setTime(message.getCreatedOn());
			if(calendar.get(Calendar.YEAR)==year)
			{
				messageListForYear.add(message);
			}
			
			}
		
		return messageListForYear;
	}
	
	public Message getMessage(Long messageId)
	{
		
		return messageDao.getMessage(messageId);
		
		//return messages.get(messageId);
	}
	public Message addMessage(Message message)
	{
		return messageDao.insertMessage(message);
		
		
	//	message.setMessageId(messages.size()+1l);
	//	messages.put(message.getMessageId(), message);
	//	return messages.get(message.getMessageId());
	}
	
	public Message UpdateMessage(Message message)
	{
		if(message.getMessageId()<=0)
		{
			return null;
		}
		 return messageDao.updateMessageDB(message);
		 //messages.put(message.getMessageId(), message);
		//return message;
	}

	public List<Message> getAllMessagesPaginated(int year)
	{
		List<Message> paginatedMessageList=new ArrayList<Message>();
		
		
		return paginatedMessageList;
	}
	
	
}
