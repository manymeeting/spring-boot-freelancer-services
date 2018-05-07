package com.freelancer.spring.flbackend.service;

import com.freelancer.spring.flbackend.dto.UserDto;
import com.freelancer.spring.flbackend.dto.UserProfileDto;

public interface UserService {

    UserDto getUserById(Integer id);

    UserProfileDto getUserProfileById(Integer id);
}
