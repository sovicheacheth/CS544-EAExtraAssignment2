package edu.mum.cs544.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author Sovichea Cheth
 * @id 985421
 * @description EA Extra Credit Assignment 2
 *
 */

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String username;
	
	@Enumerated(EnumType.STRING)
	private UserType type;
	
	@OneToMany(mappedBy="createdBy",cascade={CascadeType.ALL})
	private List<Project> projects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public User(int id, String username, UserType type, List<Project> projects) {
		super();
		this.id = id;
		this.username = username;
		this.type = type;
		this.projects = projects;
	}

	public User(String username, UserType type) {
		super();
		this.username = username;
		this.type = type;
	}
	
	
	
	
	
	

}
