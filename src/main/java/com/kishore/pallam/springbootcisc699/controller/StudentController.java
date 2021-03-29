package com.kishore.pallam.springbootcisc699.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	@GetMapping("/hello")
	public ResponseEntity<String> getStudents() {
		
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}

	
}
