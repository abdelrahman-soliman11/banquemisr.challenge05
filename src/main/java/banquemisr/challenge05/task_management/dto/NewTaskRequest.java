package banquemisr.challenge05.task_management.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class NewTaskRequest {
    private String title;
    private String description;
    private Integer priority;
    private Integer status;
    private LocalDate dueDate;
}
