package edu.mum.cs544.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.cs544.model.Resource;
import edu.mum.cs544.model.dao.ProjectDAO;
import edu.mum.cs544.model.dao.ResourceDAO;

/**
 * 
 * @author Sovichea Cheth
 * @id 985421
 * @description EA Extra Credit Assignment 2
 *
 */

@Controller
public class ResController {

	@Autowired
	private ResourceDAO res;

	@Autowired
	private ProjectDAO pro;

	@RequestMapping(value = "/add_resource")
	private String open(Model model) {
		// TODO Auto-generated method stub
		Resource p = new Resource();
		model.addAttribute("resource", p);
		return "addResource";
	}
	
	private void setHomeModel(Model model){
		model.addAttribute("projectList", ProjectDAO.findAll());
	}

}
