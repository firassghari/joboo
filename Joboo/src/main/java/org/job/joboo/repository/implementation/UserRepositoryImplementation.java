package org.job.joboo.repository.implementation;

import org.job.joboo.repository.AbstractRepository;
import org.job.joboo.repository.entity.User;
import org.job.joboo.repository.iRepository.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Repository("userRepository")
@Transactional
public class UserRepositoryImplementation extends AbstractRepository implements UserRepository{

	public Collection<User> findAll() {
		  List<User> list = (List<User>) getSession().createQuery("from User").list();
		return list;
	}

	public User findOneUserById(Long id) {
		User user =  (User) getSession().get(User.class, id);
		System.out.println("user found " + user);
		return  user;
	}

	public User editUser(User user) {

		getSession().update(user);
		return user;
	}

	public User findUserByUserName(String username) {
		return (User) getSession().createQuery("from User where uName = :username").setParameter("username", username);
	}


	public User addUser(User user) {


		getSession().save(user);
		System.out.println("inserting " + user);
		return user;
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
