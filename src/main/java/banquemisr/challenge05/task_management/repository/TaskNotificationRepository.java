package banquemisr.challenge05.task_management.repository;

import banquemisr.challenge05.task_management.model.TaskNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskNotificationRepository extends JpaRepository<TaskNotification , Long> {
}
