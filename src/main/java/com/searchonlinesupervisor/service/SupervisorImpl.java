package com.searchonlinesupervisor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.searchonlinesupervisor.model.SupervisorEntity;
import com.searchonlinesupervisor.rep.SupervisorRepo;

@Service
public class SupervisorImpl implements SupervisorService{
	
	@Autowired()
	SupervisorRepo repo;
	
	@Override
	public List<SupervisorEntity> getSupervisorDetails() {
		List<SupervisorEntity> listSupervisor = repo.findAll();
		System.out.println(listSupervisor.size());
		return listSupervisor;
	}
}
