package com.searchonlinesupervisor.service;


import javax.transaction.Transactional;

import com.searchonlinesupervisor.model.StudentEntity;

@Transactional
public interface StudentService {
	StudentEntity saveStudentDetails(StudentEntity student);
	String studentLogin(StudentEntity student);
}
