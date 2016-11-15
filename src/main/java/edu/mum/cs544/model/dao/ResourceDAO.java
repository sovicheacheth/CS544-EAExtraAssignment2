package edu.mum.cs544.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.cs544.model.Resource;

public interface ResourceDAO extends JpaRepository<Resource, Integer> {
	public Resource saveAndFlush(Resource res);

	List<Resource> findAll();
}
