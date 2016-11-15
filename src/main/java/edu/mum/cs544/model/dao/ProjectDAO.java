package edu.mum.cs544.model.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import edu.mum.cs544.model.Beneficiaries;
import edu.mum.cs544.model.Project;
import edu.mum.cs544.model.Task;



/**
 * 
 * @author Sovichea Cheth
 * @id 985421
 * @description EA Extra Credit Assignment 2, use Spring Data
 *
 */

@Repository
public class ProjectDAO{

	private SessionFactory session;
	
	public void addProject(Project project){
		session.getCurrentSession().persist(project);
		
	}
	
	public void editProject(Project project){
		session.getCurrentSession().merge(project);
		
	}
	
	public void addTask(Project project, Task t){
		project.addTask(t);
	}
	
	public void addBeneficiaries(Project project, Beneficiaries b){
		project.addBeneficiaries(b);
	}

	public SessionFactory getSession() {
		return session;
	}

	public void setSession(SessionFactory session) {
		this.session = session;
	}
	
	

}
