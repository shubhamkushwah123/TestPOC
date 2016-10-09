package com.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.database.StaticDatabase;
import com.model.Profile;

public class ProfileBusinessService {
	
	private Map<String, Profile> profiles= StaticDatabase.getProfiles();
	
	public ProfileBusinessService()
	{	
		profiles.put("shubham123", new Profile(1l, "shubham123", "shubham"));
		profiles.put("sachin123", new Profile(2l, "sachin123", "sachin"));
		
	}
	
	public List<Profile> getAllProfiles() {
		// TODO Auto-generated method stub
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		// TODO Auto-generated method stub
		return profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size()+1l);
		profiles.put(profile.getProfileName(),profile);
		return profile;
	}

	public Profile updateProfile(String profileName, Profile profile) {
		System.out.println(profileName);
		if(profileName.isEmpty())
		{
			return null;
		}
		profiles.put(profileName, profile);
		return profiles.get(profileName);
	}

	public boolean deleteProfile(String profileName) {
		if(profiles.containsKey(profileName))	
		{
			profiles.remove(profileName);
			return true;
		}
		return false;
	}

	

}
