package rohit.home.projects.workflow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Workflow {
	

	@Id @GeneratedValue
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="STARTEVENT")
	private String strartEvent;
	
}
