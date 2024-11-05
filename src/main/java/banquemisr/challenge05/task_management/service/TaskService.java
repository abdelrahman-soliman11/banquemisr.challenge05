package banquemisr.challenge05.task_management.service;


import banquemisr.challenge05.task_management.dto.NewTaskRequest;
import banquemisr.challenge05.task_management.model.Task;
import banquemisr.challenge05.task_management.model.TaskHistory;
import banquemisr.challenge05.task_management.model.TaskPriority;
import banquemisr.challenge05.task_management.model.TaskStatus;
import banquemisr.challenge05.task_management.repository.TaskHistoryRepository;
import banquemisr.challenge05.task_management.repository.TaskPriorityRepository;
import banquemisr.challenge05.task_management.repository.TaskRepository;
import banquemisr.challenge05.task_management.repository.TaskStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskStatusRepository taskStatusRepository;
    private final TaskPriorityRepository taskPriorityRepository;
    private final TaskHistoryRepository taskHistoryRepository;

    public Page<Task> getAllTasks(int page  , int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return taskRepository.findAll(pageable);
    }

    public List<TaskStatus> loadTaskStatusLookUps(){
        return taskStatusRepository.findAll();
    }
    public List<TaskPriority> loadTaskPriorityLookUps(){
        return taskPriorityRepository.findAll();
    }

    public Task findTaskById(int id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void deleteTask(Integer taskId) {
        taskRepository.deleteById(taskId);
    }

    public void updateTask(Integer newStatus , Integer taskId) {
        taskRepository.updateTaskStatusByTaskId(newStatus , taskId);
    }
    public List<TaskHistory> loadAllTaskHistory(Integer taskId) {
        return taskHistoryRepository.findAllByTaskId(taskId);
    }

    public List<Task> findByTitle(String title) {
        return taskRepository.findByTitle(title);
    }

    public void addNewTask(NewTaskRequest task) {
        Task newTask = buildTask(task);
        saveTask(newTask);
    }

    private void saveTask(Task task) {
        taskRepository.save(task);
    }

    private Task buildTask(NewTaskRequest task) {
        return   Task.builder()
                .title(task.getTitle())
                .description(task.getDescription())
                .status(task.getStatus())
                .priority(task.getPriority())
                .dueDate(task.getDueDate())
                .build();
    }

}
