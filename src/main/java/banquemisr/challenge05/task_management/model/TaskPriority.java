package banquemisr.challenge05.task_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "TASK_PRIORITY")
public class TaskPriority {

    @Id
    @Column(name = "PRIORITY_ID")
    private Integer priorityId;

    @Column(name = "PRIORITY_DESC", nullable = false, length = 100)
    private String priorityDesc;
}

