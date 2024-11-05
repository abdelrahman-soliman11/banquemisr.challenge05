package banquemisr.challenge05.task_management.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class TaskDTO {
    private String title;
    private String description;
    private Integer status;
    private Integer priority;
    private LocalDate dueDate;
}
