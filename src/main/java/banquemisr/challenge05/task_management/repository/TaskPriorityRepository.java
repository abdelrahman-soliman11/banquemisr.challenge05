package banquemisr.challenge05.task_management.repository;

import banquemisr.challenge05.task_management.model.TaskPriority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskPriorityRepository extends JpaRepository<TaskPriority, Integer> {
}
