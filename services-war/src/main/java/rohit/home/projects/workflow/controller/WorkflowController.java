package rohit.home.projects.workflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rohit.home.projects.workflow.domain.Workflow;
import rohit.home.projects.workflow.domain.WorkflowEvent;
import rohit.home.projects.workflow.domain.repository.WorkflowEventRepository;
import rohit.home.projects.workflow.domain.repository.WorkflowRepository;

@RestController
public class WorkflowController {

	@Autowired
	WorkflowRepository workflowRepository;
	@Autowired
	WorkflowEventRepository workflowEventRepository;

	@RequestMapping(name="/workflow/list")
	@ResponseBody
	public List<Workflow> getAllWorkflows() {
		return workflowRepository.findAll();
	}
	
	@RequestMapping(name="/workflowEvents/list", method=RequestMethod.GET)
	@ResponseBody
	public List<WorkflowEvent> getAllWorkflowEvents() {
		return workflowEventRepository.findAll();
	}
	
}