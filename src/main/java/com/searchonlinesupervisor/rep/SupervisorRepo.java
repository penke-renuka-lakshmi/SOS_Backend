package com.searchonlinesupervisor.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.searchonlinesupervisor.model.SupervisorEntity;

@CrossOrigin("http://localhost:8888")
public interface SupervisorRepo extends JpaRepository<SupervisorEntity, Integer>{

}
