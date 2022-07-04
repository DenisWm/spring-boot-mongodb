package com.denismamoni.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denismamoni.workshopmongo.domain.User;
import com.denismamoni.workshopmongo.dto.UserDTO;
import com.denismamoni.workshopmongo.repository.UserRepository;
import com.denismamoni.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public List<User> findAll() {
		List<User> users = repo.findAll();
		return users;
	}

	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public User insert(User user) {
		return repo.insert(user);
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}

	public User fromDto(UserDTO userDto) {
		return new User(userDto.getId(), userDto.getNome(), userDto.getEmail());
	}

}
