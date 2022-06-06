package com.tech11.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech11.entity.User;
import com.tech11.exceptions.ResourceNotFoundException;
import com.tech11.repo.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		Optional<User> userRow = this.userRepository.findById(user.getId());
		if(userRow.isPresent()) {
			User usrUpdate = userRow.get();
			usrUpdate.setId(user.getId());
			usrUpdate.setFirstName(user.getFirstName());
			usrUpdate.setLastName(user.getLastName());
			usrUpdate.setEmail(user.getEmail());
			usrUpdate.setPassword(user.getPassword());
			usrUpdate.setBirthDate(user.getBirthDate());
			userRepository.save(usrUpdate);
			return usrUpdate;
		}else {
			throw new ResourceNotFoundException("Resource with the id: "+user.getId()+ " was not found");
		}
		
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(long userId) {
		Optional<User> usr = userRepository.findById(userId);
		if(usr.isPresent()) {
			return usr.get();
		}else{
			throw new ResourceNotFoundException("Resource with the id: "+userId+ " was not found");
		}
	}

	@Override
	public void deleteUser(long userId) {
		Optional<User> usr = userRepository.findById(userId);
		if(usr.isPresent()) {
			userRepository.deleteById(userId);
		}else{
			throw new ResourceNotFoundException("Resource with the id: "+userId+ " was not found");
		}
	}



}
