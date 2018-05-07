package com.freelancer.spring.flbackend.service.impl;


import com.freelancer.spring.flbackend.User;
import com.freelancer.spring.flbackend.dao.UserDao;
import com.freelancer.spring.flbackend.dto.UserDto;
import com.freelancer.spring.flbackend.dto.UserProfileDto;
import com.freelancer.spring.flbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public UserDto getUserById(Integer id) {
        User user = userDao.findUserById(id);
        return UserDto.mapToUserDto(user);
    }

    @Override
    public UserProfileDto getUserProfileById(Integer id) {
        User user = userDao.findUserById(id);
        return UserProfileDto.mapToUserProfileDto(user);
    }


}
