package org.job.joboo.controller.rest;


import org.job.joboo.model.dto.UserDTO;
import org.job.joboo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userdto)
	{
		System.out.println("je modifie " + userdto.toString());
		UserDTO user = null ;

		try {
		user = userService.addUser(userdto);
		return new ResponseEntity<UserDTO>(user , HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<UserDTO>(user, HttpStatus.INTERNAL_SERVER_ERROR);
		}



	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	ResponseEntity<Collection<UserDTO>> ListUsers() {

		Collection<UserDTO> users = null;
		try {
			users = userService.findAllUsers();

			return new ResponseEntity<Collection<UserDTO>>(users, HttpStatus.OK);

		} catch (Exception ex) {
			return new ResponseEntity<Collection<UserDTO>>(users, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	ResponseEntity<UserDTO> edituser(@RequestBody UserDTO userdto) {

		UserDTO user = null;
		try {
		user = userService.editUser(userdto);
		return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
		} catch (Exception ex) {
			System.out.println("exception remontée" + ex);
			return new ResponseEntity<UserDTO>(user, HttpStatus.INTERNAL_SERVER_ERROR);
		}




	}

	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	ResponseEntity<UserDTO> gettuser(@PathVariable Long userId) {

		UserDTO user = null;
		try {
			user = userService.getUser(userId);
			return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
		} catch (Exception exp) {
			return new ResponseEntity<UserDTO>(user, HttpStatus.INTERNAL_SERVER_ERROR);
		}




	}
}
