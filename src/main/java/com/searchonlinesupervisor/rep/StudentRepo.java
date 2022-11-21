package com.searchonlinesupervisor.rep;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.searchonlinesupervisor.model.StudentEntity;

@CrossOrigin("http://localhost:4200")
public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{
	List<StudentEntity> findByEmail(String email);
	@Transactional
	@Modifying
	@Query("UPDATE StudentEntity se SET se.feedback=:feedback WHERE se.email=:email")
	void updateFeedback(String feedback, String email);
}
