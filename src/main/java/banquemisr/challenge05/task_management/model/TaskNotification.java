package banquemisr.challenge05.task_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "TASK_NOTIFICATION")
public class TaskNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TASK_ID")
    private Integer taskId;

    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;

    @Column(name = "SEND_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;

    @Column(name = "SENDER", nullable = false, length = 100)
    private String sender;
}

