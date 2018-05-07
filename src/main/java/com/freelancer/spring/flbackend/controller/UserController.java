package com.freelancer.spring.flbackend.controller;

import com.freelancer.spring.flbackend.dto.UserDto;
import com.freelancer.spring.flbackend.dto.UserProfileDto;
import com.freelancer.spring.flbackend.dto.param.CreateUserDto;
import com.freelancer.spring.flbackend.dto.param.UpdateAvatarUrlDto;
import com.freelancer.spring.flbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;


@RestController
@Transactional(rollbackFor = Exception.class)
public class UserController extends GenericController{

    @Autowired
    UserService userService;

    @GetMapping("/users/{userId}")
    public ResponseEntity getUser(@PathVariable Integer userId) {
        UserDto userDto = userService.getUserById(userId);

        if (userDto != null)
            return success(userDto);
        return notFound();
    }

    @GetMapping("/users/{userId}/profile")
    public ResponseEntity getProfile(@PathVariable Integer userId) {
        UserProfileDto userProfileDto = userService.getUserProfileById(userId);

        if (userProfileDto != null)
            return success(userProfileDto);
        return notFound();
    }

    @PostMapping("/users")
    public ResponseEntity createUser(@RequestBody CreateUserDto createUserDto)
    {
        // check validity
        if(createUserDto.getUserPassword() == null || createUserDto.getUserEmail() == null
                || createUserDto.getUserName() == null)
        {
            return badRequest();
        }
        // check duplicate email
        if(userService.getUserByEmail(createUserDto.getUserEmail()) != null)
        {
            return badRequestWithtMsg("Duplicate User");
        }

        UserDto userDto = userService.createUser(createUserDto);
        return success(userDto);
    }

    @PutMapping("/users/{userId}/avatar")
    public ResponseEntity updateAvatar(@PathVariable Integer userId, @RequestBody UpdateAvatarUrlDto updateAvatarUrlDto)
    {
        //check validity
        if(updateAvatarUrlDto.getAvatarUrl() == null || updateAvatarUrlDto.getAvatarUrl().length() == 0)
        {
            return badRequest();
        }
        UserProfileDto userProfileDto = userService.updateAvatarUrl(userId, updateAvatarUrlDto.getAvatarUrl());
        return  success(userProfileDto);
    }
}
