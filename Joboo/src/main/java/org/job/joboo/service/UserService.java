package org.job.joboo.service;

import org.job.joboo.model.dto.UserDTO;
import org.job.joboo.repository.entity.User;
import org.job.joboo.repository.iRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

@Service(value="userService")
public class UserService {

	@Autowired UserRepository userRepository ; 
	
	public UserDTO addUser(UserDTO user)
	{
		   Date joindate = setCurrentDate();
		   user.setJoinDate(joindate);
		User usertoinsert = new User(user);
		System.out.println("user to insert " + usertoinsert);
		userRepository.addUser(usertoinsert);
		return user;
		
	}

	public UserDTO getUser(Long userid) {
		User user = userRepository.findOneUserById(userid);
		return new UserDTO(user);
	}

	public Collection<UserDTO> findAllUsers() {
		Collection<User> users = userRepository.findAll();
		Collection<UserDTO> newusers = new ArrayList<UserDTO>();
		for (User user : users) {
			newusers.add(new UserDTO(user));
		}
		return newusers;
	}

	public UserDTO editUser(UserDTO userToEdit) {
		return new UserDTO(userRepository.editUser(new User(userToEdit)));
	}
	private Date setCurrentDate() {
		Date joindate = new Date();
		   Calendar cal = Calendar.getInstance();
		   joindate = cal.getTime();
		return joindate;
	}
	
	
}
