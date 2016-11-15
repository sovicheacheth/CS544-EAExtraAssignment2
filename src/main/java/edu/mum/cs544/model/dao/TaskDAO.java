package edu.mum.cs544.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.cs544.model.Task;

/**
 * 
 * @author Sovichea Cheth
 * @id 985421
 * @description EA Extra Credit Assignment 2, use Spring Data
 *
 */

public interface TaskDAO extends JpaRepository<Task, Integer> {

	public Task saveAndFlush(Task t);

	public List<Task> findAll();

	public List<Task> findByProjectId(int id);
}
