package org.job.joboo.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.job.joboo.model.dto.UserDTO;
import org.job.joboo.repository.entity.User;
import org.job.joboo.repository.iRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {

	@Autowired UserRepository userRepository ; 
	
	public UserDTO addUser(UserDTO user)
	{
		   Date joindate = setCurrentDate();
		   user.setJoinDate(joindate);
		   userRepository.addUser(new User(user));
		return user;
		
	}


	private Date setCurrentDate() {
		Date joindate = new Date();
		   Calendar cal = Calendar.getInstance();
		   joindate = cal.getTime();
		return joindate;
	}
	
	
}
