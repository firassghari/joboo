package org.job.joboo.repository.iRepository;

import org.job.joboo.repository.entity.User;

import java.util.Collection;

public interface UserRepository {
	/* method to find all users*/
	Collection<User> findAll();
	/*method to find user By identifiant*/
	User findOneUserById(Long id);
	/* method to edit user */
	User editUser(User user);
	/* method to add user */
	User findUserByUserName(String username);

	User addUser(User user);

	Collection<User> searchUserByName(String name);

	Collection<User> serachUserByFirstName(String fname);

	Collection<User> serachUserByCountry(String country);

	Collection<User> searchUserByCity(String city);

	
}
