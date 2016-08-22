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

import java.util.Collection;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userdto)
	{
		System.out.println(userdto.toString());
		UserDTO user = null ;

		user = userService.addUser(userdto);

		return new ResponseEntity<UserDTO>(user , HttpStatus.OK);


	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	ResponseEntity<Collection<UserDTO>> ListUsers() {

		Collection<UserDTO> users = null;

		users = userService.findAllUsers();

		return new ResponseEntity<Collection<UserDTO>>(users, HttpStatus.OK);


	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	ResponseEntity<UserDTO> edituser(@RequestBody UserDTO userdto) {
		System.out.println(userdto.toString());
		UserDTO user = null;

		user = userService.editUser(userdto);

		return new ResponseEntity<UserDTO>(user, HttpStatus.OK);


	}
}
