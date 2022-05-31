package com.nada.ordinateur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.nada.ordinateur.entities.Role;
import com.nada.ordinateur.entities.User;
import com.nada.ordinateur.repos.RoleRepo;
import com.nada.ordinateur.repos.UserRepo;

public class UserServiceImp implements UserService {

	@Override
	public List<User> findAll() {
	
		return userRepository.findAll();
		
	}
	
	@Autowired
	UserRepo userRepository ;
	

	@Autowired
	RoleRepo roleRepo ;
	
	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public Page<User> getAllUsersParPage(int page, int size) {
		
		return userRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User getUsers(Long id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public User updateUsers(User g) {
		
		return userRepository.save(g);
	}
	

	@Override
	public List <Role> getRoles(){
		return roleRepo.findAll();
	}

}
