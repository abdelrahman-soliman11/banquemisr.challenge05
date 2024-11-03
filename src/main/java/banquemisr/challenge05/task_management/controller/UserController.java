package banquemisr.challenge05.task_management.controller;


import banquemisr.challenge05.task_management.model.UserType;
import banquemisr.challenge05.task_management.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("all-user-types")
    ResponseEntity<List<UserType>> getAllUserTypes() {
        return ResponseEntity.ok(userService.getAllUserTypes());
    }
}
