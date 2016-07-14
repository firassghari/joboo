package org.job.joboo.controller.rest;


import org.job.joboo.model.dto.UserDTO;

import org.job.joboo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	@RequestMapping(value = "/users/add",method = RequestMethod.POST)
	ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userdto)
	{
		UserDTO user = null ;
		try 
		{
			 user = userService.addUser(userdto);
		}
		catch( Exception ex)
		{
			return new ResponseEntity<UserDTO>(user , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		 return new ResponseEntity<UserDTO>(user , HttpStatus.OK);
		
		
	}
}
