package com.searchonlinesupervisor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.searchonlinesupervisor.model.SupervisorEntity;
import com.searchonlinesupervisor.service.SupervisorService;

@CrossOrigin("http://localhost:4200")
@RestController
public class SupervisorController {

	@Autowired
	SupervisorService ser;
	
	@GetMapping("/getAllSupervisorDetails")
	public ResponseEntity<List<SupervisorEntity>> getAllSupervisorDetails(){
		List<SupervisorEntity> supervisorDetails = ser.getSupervisorDetails();
		return new ResponseEntity<List<SupervisorEntity>>(supervisorDetails, HttpStatus.OK);
	}
}
