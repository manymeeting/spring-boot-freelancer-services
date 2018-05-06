package com.freelancer.spring.flbackend.controller;

import com.freelancer.spring.flbackend.dto.UserDto;
import com.freelancer.spring.flbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.transaction.annotation.Transactional;


@RestController
@Transactional(rollbackFor = Exception.class)
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users/{userId}")
    public UserDto getUser(@PathVariable Integer userId) {
        UserDto userDto = userService.getUserById(userId);

        if (userDto != null)
            return userDto;
        return null;
    }
}
