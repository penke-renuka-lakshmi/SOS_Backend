package com.searchonlinesupervisor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.searchonlinesupervisor.model.StudentEntity;
import com.searchonlinesupervisor.rep.StudentRepo;

@Service
public class StudentImpl implements StudentService{
		
	@Autowired
	StudentRepo rep;
	
	@Override
	public StudentEntity saveStudentDetails(StudentEntity student) {
		StudentEntity studentData = null;
		List<StudentEntity> duplicateEmail = rep.findByEmail(student.getEmail());
		if(duplicateEmail.size()==0) {
		studentData = rep.save(student);
		}
		return studentData;
	}

	@Override
	public String studentLogin(StudentEntity student) {
		String studentflag = "false";
		List<StudentEntity> listOfStudent = rep.findByEmail(student.getEmail());
		if(listOfStudent.size()>0) {
		if(student.getPassword().equals(listOfStudent.get(0).getPassword())) {
			studentflag = "true";
			if(student.getFeedback()!=null) 
			rep.updateFeedback(student.getFeedback(), student.getEmail());
			}
		}
		return studentflag;
	}
	
}
