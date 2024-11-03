package banquemisr.challenge05.task_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "TASK_HISTORY")
public class TaskHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TASK_ID")
    private Integer taskId;

    @Column(name = "PRE_STATUS")
    private Integer preStatus;

    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATE_USER", nullable = false, length = 100)
    private String lastUpdateUser;
}
