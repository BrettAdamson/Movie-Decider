package com.brettadamson.moviedecider.controller;

import com.brettadamson.moviedecider.model.UserEntity;
import com.brettadamson.moviedecider.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

        @GetMapping("/{id}")
    public Optional<UserEntity> findEmployeeById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

        @PostMapping
    public UserEntity saveUser(@RequestBody UserEntity userEntity){
        return userService.saveUser(userEntity);
    }

    @PutMapping
    public UserEntity updateUser(@RequestBody UserEntity userEntity){
        return userService.updateUser(userEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
}
