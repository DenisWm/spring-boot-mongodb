package com.denismamoni.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denismamoni.workshopmongo.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository repo;

	
}
