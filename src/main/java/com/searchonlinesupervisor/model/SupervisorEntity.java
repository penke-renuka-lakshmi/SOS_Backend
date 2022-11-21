package com.searchonlinesupervisor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "supervisor_table")
public class SupervisorEntity {

	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="EMPLOYEEID")
	private String employeeid;

	@Column(name="NAME")
	private String name;

	@Column(name="ROLE")
	private String role;
	
	@Column(name="DOMAIN")
	private String domain;

	@Column(name="EXPERIENCE")
	private Integer experience;

	@Column(name="STATUS")
	private String status;

	@Column(name="LOCATION")
	private String location;

	@Column(name="EMAIL")
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setContact(String email) {
		this.email = email;
	}
	
}
