package edu.mum.cs544.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.cs544.main.TaskService;
import edu.mum.cs544.model.Task;

@Controller
public class TaskController {

	@Autowired
	private TaskService tService;

	@RequestMapping(value = "/tasks")
	public String openTasksPage(Model model, @RequestParam("projectId") int projectId) {
		model.addAttribute("taskList", tService.getTasks(projectId));
		model.addAttribute("task", new Task());
		return "tasks";
	}

}
