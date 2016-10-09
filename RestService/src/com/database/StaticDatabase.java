package com.database;

import java.util.HashMap;
import java.util.Map;

import com.model.Comment;
import com.model.Message;
import com.model.Profile;

public class StaticDatabase {
	
	private static Map<Long,Message> messages = new HashMap();
	private static Map<String, Profile> profiles = new HashMap();
	private static Map<Integer, Comment> comments = new HashMap();
	
	public static Map<Long,Message> getMessages()
	{
		return messages;
	}

	public static Map<String, Profile> getProfiles()
	{
		return profiles;
		
	}
	
	public static Map<Integer, Comment> getComments()
	{
		return comments;
	}
}
