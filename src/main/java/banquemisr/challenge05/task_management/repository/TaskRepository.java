package banquemisr.challenge05.task_management.repository;

import banquemisr.challenge05.task_management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
