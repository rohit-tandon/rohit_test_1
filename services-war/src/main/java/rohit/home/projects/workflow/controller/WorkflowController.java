package rohit.home.projects.workflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rohit.home.projects.workflow.domain.Workflow;
import rohit.home.projects.workflow.domain.repository.WorkflowRepository;

@RestController
public class WorkflowController {
	
	@Autowired
	WorkflowRepository workflowRepository;
	
	@RequestMapping("/workflow//list")
	public List<Workflow> getAllWorkflows() {
		return workflowRepository.findAll();
	}
	
}