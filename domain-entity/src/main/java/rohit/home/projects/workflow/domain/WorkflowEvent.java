package rohit.home.projects.workflow.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="WORKFLOWEVENT")
public class WorkflowEvent {
	
	@Id @GeneratedValue
	private long id;
	private String name;
}