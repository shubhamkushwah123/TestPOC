package com.service;


import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;



import com.business.service.ProfileBusinessService;
import com.model.Profile;


@Path("/profiles")
public class ProfileService {
	
ProfileBusinessService pservice = new ProfileBusinessService();
	
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Profile> getAllProfiles()
{
	return pservice.getAllProfiles();
}

@GET
@Path("/{profileName}")
@Produces(MediaType.APPLICATION_JSON)
public Profile getProfile(@PathParam("profileName") String profileName)
{
	return pservice.getProfile(profileName);
}

@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Profile addProfile(Profile profile)
{
	pservice.addProfile(profile);
	return profile;
}

@PUT
@Path("/{profileName}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile){
	
	return pservice.updateProfile(profileName,profile);	
}


@DELETE
@Path("/{profileName}")
@Produces(MediaType.TEXT_PLAIN)
public String deleteProfile(@PathParam("profileName") String profileName)
{
	if(pservice.deleteProfile(profileName))
	return "Profile Deleted" + profileName.toString();
	else
	return "Unable to delete";
}	
}

