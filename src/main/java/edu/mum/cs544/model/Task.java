package edu.mum.cs544.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

/**
 * 
 * @author Sovichea Cheth
 * @id 985421
 * @description EA Extra Credit Assignment 2
 *
 */

@Entity
public class Task {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;

	@Enumerated(EnumType.STRING)
	private Status status;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "TaskResources", joinColumns = @JoinColumn(name = "task_id"), inverseJoinColumns = @JoinColumn(name = "resource_id"))
	private List<Resource> resources;
	@ManyToOne
	@JoinColumn(name = "projectId")
	private Project project;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Task(String name, String description, Status status) {
		super();
		this.name = name;
		this.description = description;
		this.status = status;
	}

	public Task() {
		// TODO Auto-generated constructor stub
	}

}
