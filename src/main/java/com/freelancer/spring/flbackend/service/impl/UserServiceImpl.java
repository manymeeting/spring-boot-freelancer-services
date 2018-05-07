package com.freelancer.spring.flbackend.service.impl;


import com.freelancer.spring.flbackend.entity.User;
import com.freelancer.spring.flbackend.dao.UserDao;
import com.freelancer.spring.flbackend.dto.UserDto;
import com.freelancer.spring.flbackend.dto.UserProfileDto;
import com.freelancer.spring.flbackend.dto.param.CreateUserDto;
import com.freelancer.spring.flbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDao userDao;

    @Override
    public UserDto getUserById(Integer id) {
        User user = userDao.findUserById(id);
        return UserDto.mapToUserDto(user);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        User user = userDao.findUserByEmail(email);
        return UserDto.mapToUserDto(user);
    }

    @Override
    public UserProfileDto getUserProfileById(Integer id) {
        User user = userDao.findUserById(id);
        return UserProfileDto.mapToUserProfileDto(user);
    }

    @Override
    public UserDto createUser(CreateUserDto createUserDto) {
        createUserDto.setUserPassword(passwordEncoder.encode(createUserDto.getUserPassword()));
        User user = CreateUserDto.toUser(createUserDto);
        user = userDao.save(user);

        return UserDto.mapToUserDto(user);
    }


}
