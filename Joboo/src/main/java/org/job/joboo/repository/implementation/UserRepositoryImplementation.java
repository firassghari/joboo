package org.job.joboo.repository.implementation;

import java.util.Collection;
import java.util.List;

import org.job.joboo.repository.AbstractRepository;
import org.job.joboo.repository.entity.User;
import org.job.joboo.repository.iRepository.UserRepository;

public class UserRepositoryImplementation extends AbstractRepository implements UserRepository{

	public Collection<User> findAll() {
		  List<User> list = (List<User>) getSession().createQuery("from User").list();
		return list;
		
	}

	public User findOneUserById(Long id) {
		User user =  (User) getSession().get(User.class, id);
		return  user;
	}

	public User editUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<User> searchUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<User> serachUserByFirstName(String fname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<User> serachUserByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<User> searchUserByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
