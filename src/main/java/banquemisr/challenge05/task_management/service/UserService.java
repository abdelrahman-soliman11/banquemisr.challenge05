package banquemisr.challenge05.task_management.service;


import banquemisr.challenge05.task_management.model.UserType;
import banquemisr.challenge05.task_management.repository.UserTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserTypeRepository userTypeRepository;

    public List<UserType> getAllUserTypes(){
        return userTypeRepository.findAll();
    }
}
