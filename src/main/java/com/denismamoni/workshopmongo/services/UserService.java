package com.denismamoni.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denismamoni.workshopmongo.domain.User;
import com.denismamoni.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public List<User> findAll(){
		List<User> users = repo.findAll();
		return users;
	}
}
