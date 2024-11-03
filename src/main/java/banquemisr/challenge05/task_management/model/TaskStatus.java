package banquemisr.challenge05.task_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TASK_STATUS")
public class TaskStatus {

    @Id
    @Column(name = "STATUS_ID")
    private Integer statusId;

    @Column(name = "STATUS_DESC", nullable = false, length = 100)
    private String statusDesc;
}

