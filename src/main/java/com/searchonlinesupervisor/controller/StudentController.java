package com.searchonlinesupervisor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.searchonlinesupervisor.model.StudentEntity;
import com.searchonlinesupervisor.service.StudentService;

@CrossOrigin("http://localhost:4200")
@RestController
public class StudentController {
	@Autowired
	StudentService se;
	
	@PostMapping("/saveAllStudentDetails")
	public ResponseEntity<?> saveStudentDetails(@RequestBody StudentEntity student) {
		StudentEntity saveStudentDetails = se.saveStudentDetails(student);
		if(saveStudentDetails!=null) {
		return new ResponseEntity<String>("true", HttpStatus.OK);
	}
		return new ResponseEntity<String>("false", HttpStatus.OK);
	}
	
	@PostMapping("/studentLogin")
	public ResponseEntity<String> studentLogin(@RequestBody StudentEntity student) {
		String studentLogin = se.studentLogin(student);
		return new ResponseEntity<String>(studentLogin, HttpStatus.OK);
	}
}
