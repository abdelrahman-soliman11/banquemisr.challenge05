package banquemisr.challenge05.task_management.repository;

import banquemisr.challenge05.task_management.model.TaskHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskHistoryRepository extends JpaRepository<TaskHistory, Integer> {
    List<TaskHistory> findAllByTaskId(Integer taskId);
}
