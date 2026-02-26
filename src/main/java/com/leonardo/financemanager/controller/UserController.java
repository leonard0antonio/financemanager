package com.leonardo.financemanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.leonardo.financemanager.service.UserService;
import com.leonardo.financemanager.model.User;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public User create(@RequestBody User user){
        return service.create(user);
    }

    @GetMapping
    public List<User> list(){
        return service.findAll();
    }
}