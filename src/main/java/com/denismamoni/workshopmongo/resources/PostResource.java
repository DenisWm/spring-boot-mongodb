package com.denismamoni.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.denismamoni.workshopmongo.domain.Post;
import com.denismamoni.workshopmongo.services.PostService;
import com.denismamoni.workshopmongo.services.util.URL;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	PostService postService;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Post> find(@PathVariable String id){
		Post post = postService.findById(id);
		return ResponseEntity.ok().body(post);
	}
	
	@GetMapping(path = "/titlesearch")
	public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text){
		String param = URL.decodeParam(text);
		List<Post> list = postService.findByTitle(param);
		return ResponseEntity.ok().body(list);
	}
	
}
