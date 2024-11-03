package banquemisr.challenge05.task_management.repository;

import banquemisr.challenge05.task_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
