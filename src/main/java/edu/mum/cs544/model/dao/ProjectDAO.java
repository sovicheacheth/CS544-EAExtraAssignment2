package edu.mum.cs544.model.dao;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;



/**
 * 
 * @author Sovichea Cheth
 * @id 985421
 * @description EA Extra Credit Assignment 2, use Spring Data
 *
 */

public class ProjectDAO extends JpaRepositoryFactory{

	public ProjectDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
	

}
