package com.freelancer.spring.flbackend.service.impl;


import com.freelancer.spring.flbackend.User;
import com.freelancer.spring.flbackend.dao.UserDao;
import com.freelancer.spring.flbackend.dto.UserDto;
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
        return _mapToUserDto(user);
    }


    private UserDto _mapToUserDto(User user)
    {
        UserDto userDto = new UserDto();
        userDto.setUserId(user.getUserId());
        userDto.setUserAvatarUrl(user.getUserAvatarUrl());
        userDto.setUserEmail(user.getUserEmail());
        userDto.setUserName(user.getUserName());
        userDto.setUserPhone(user.getUserPhone());
        userDto.setUserAbout(user.getUserAbout());
        userDto.setUserSkills(user.getUserSkills());
        userDto.setUserPassword(user.getUserPassword());

        return userDto;
    }

}
