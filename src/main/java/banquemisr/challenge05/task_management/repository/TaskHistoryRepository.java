package banquemisr.challenge05.task_management.repository;

import banquemisr.challenge05.task_management.model.TaskHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskHistoryRepository extends JpaRepository<TaskHistory, Integer> {
}
