package banquemisr.challenge05.task_management.repository;

import banquemisr.challenge05.task_management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    
    void updateTaskStatusByTaskId(Integer newStatus, Integer taskId);

    List<Task> findByTitle(String title);
}
