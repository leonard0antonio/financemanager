package com.leonardo.financemanager.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.leonardo.financemanager.repository.UserRepository;
import com.leonardo.financemanager.model.User;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User create(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}