package banquemisr.challenge05.task_management.controller;

import banquemisr.challenge05.task_management.dto.NewTaskRequest;
import banquemisr.challenge05.task_management.model.Task;
import banquemisr.challenge05.task_management.model.TaskHistory;
import banquemisr.challenge05.task_management.model.TaskPriority;
import banquemisr.challenge05.task_management.model.TaskStatus;
import banquemisr.challenge05.task_management.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("task")
public class TaskController {
    private final TaskService taskService;

    @GetMapping("task-details")
    ResponseEntity<Task> findTaskDetails(@PathVariable int taskId) {
        return ResponseEntity.ok(taskService.findTaskById(taskId));
    }

    @GetMapping("search-title")
    ResponseEntity<List<Task>> filterByTitle(@PathVariable String title) {
        return ResponseEntity.ok(taskService.findByTitle(title));
    }

    @GetMapping("tasks")
    ResponseEntity<Page<Task>> findAllTasks(@Param("page") int page, @Param("size") int size) {
        return ResponseEntity.ok(taskService.getAllTasks(page , size));
    }


    @GetMapping("task-status")
    ResponseEntity<List<TaskStatus>> findTaskStatus() {
        return ResponseEntity.ok(taskService.loadTaskStatusLookUps());
    }

    @GetMapping("task-priority")
    ResponseEntity<List<TaskPriority>> findTaskPriority() {
        return ResponseEntity.ok(taskService.loadTaskPriorityLookUps());
    }

    @GetMapping("task-history")
    ResponseEntity<List<TaskHistory>> findTaskPriority(@PathVariable int taskId) {
        return ResponseEntity.ok(taskService.loadAllTaskHistory(taskId));
    }

    @DeleteMapping("delete-task")
    ResponseEntity<?> deleteTask(@PathVariable int taskId) {
        taskService.deleteTask(taskId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("update-task")
    ResponseEntity<?> updateTask(@PathVariable int taskId, @PathVariable Integer taskStatus) {
        taskService.updateTask(taskId, taskStatus);
        return ResponseEntity.ok().build();
    }

    @PostMapping("new-task")
    ResponseEntity<?> newTask(@RequestBody NewTaskRequest newTaskRequest) {
        taskService.addNewTask(newTaskRequest);
        return ResponseEntity.ok().build();
    }
}
