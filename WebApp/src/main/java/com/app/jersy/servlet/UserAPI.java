package com.app.jersy.servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.servlet.pojo.UserPOJO;

@Path("user")
public class UserAPI {
	
	@Path("{name}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserPOJO getName(@PathParam("name") String name) {
		UserPOJO userPojo = new UserPOJO().setName(name);
		return userPojo;
	}	
}
