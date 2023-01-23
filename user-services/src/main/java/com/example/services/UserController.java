package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public void addUser(@RequestBody() UserRequestDto userRequestDto) {
        userService.addUser(userRequestDto);
    }

    @GetMapping("/get-user")
    public User getByUserName(@RequestParam("username") String userName) {
        return userService.getByUserName(userName);
    }
}
