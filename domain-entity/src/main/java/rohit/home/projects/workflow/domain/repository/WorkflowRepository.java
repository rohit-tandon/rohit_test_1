package rohit.home.projects.workflow.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rohit.home.projects.workflow.domain.Workflow;

public interface WorkflowRepository extends JpaRepository<Workflow, Long> {

}
