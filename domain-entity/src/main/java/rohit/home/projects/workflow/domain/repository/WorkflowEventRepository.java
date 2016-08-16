package rohit.home.projects.workflow.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rohit.home.projects.workflow.domain.WorkflowEvent;

public interface WorkflowEventRepository extends JpaRepository<WorkflowEvent, Long> {

}
