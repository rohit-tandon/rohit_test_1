package rohit.home.projects.workflow.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class WorkflowEvent {
	
	@Id @GeneratedValue
	private long id;
	private String name;
}