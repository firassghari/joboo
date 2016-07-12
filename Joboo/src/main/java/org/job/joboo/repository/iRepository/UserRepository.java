package org.job.joboo.repository.iRepository;
import java.util.Collection;

import org.job.joboo.repository.entity.User;

public interface UserRepository {
	/* method to find all users*/
	public Collection<User> findAll();
	/*method to find user By identifiant*/
	public User findOneUserById(Long id);
	/* method to edit user */
	public User editUser(User user );
	/* method to add user */
	public User addUser(User user);
	public Collection<User> searchUserByName(String name);
	public Collection <User> serachUserByFirstName(String fname);
	public Collection <User> serachUserByCountry(String country);
	public Collection <User> searchUserByCity	(String city);

	
}
