package banquemisr.challenge05.task_management.repository;

import banquemisr.challenge05.task_management.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStatusRepository extends JpaRepository<TaskStatus, Integer> {
}
