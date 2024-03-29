package com.freelancer.spring.flbackend.service;

import com.freelancer.spring.flbackend.dto.UserDto;
import com.freelancer.spring.flbackend.dto.UserProfileDto;
import com.freelancer.spring.flbackend.dto.param.CreateUserDto;
import com.freelancer.spring.flbackend.dto.param.UpdateUserDto;

public interface UserService {

    UserDto getUserById(Integer id);

    UserDto getUserByEmail(String email);

    UserProfileDto getUserProfileById(Integer id);

    UserDto createUser(CreateUserDto createUserDto);

    UserProfileDto updateAvatarUrl(Integer id, String avatarUrl);

    UserDto updateUser(Integer id, UpdateUserDto updateUserDto);
}
