package banquemisr.challenge05.task_management.repository;

import banquemisr.challenge05.task_management.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Long> { }
