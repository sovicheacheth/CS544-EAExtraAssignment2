package edu.mum.cs544.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Sovichea Cheth
 * @id 985421
 * @description EA Extra Credit Assignment 2
 *
 */

@Entity
public class Resource {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
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
	public Resource(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
