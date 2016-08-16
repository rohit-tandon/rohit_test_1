package rohit.home.projects.workflow.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rohit.home.projects.workflow.domain.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
