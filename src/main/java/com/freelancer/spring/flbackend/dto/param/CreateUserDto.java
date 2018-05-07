package com.freelancer.spring.flbackend.dto.param;

import com.freelancer.spring.flbackend.User;

import java.io.Serializable;

public class CreateUserDto implements Serializable {

    private String userName;

    private String userPassword;

    private String userEmail;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    public static User toUser(CreateUserDto createUserDto)
    {
        User user = new User();
        user.setUserEmail(createUserDto.getUserEmail());
        user.setUserPassword(createUserDto.getUserPassword());
        user.setUserName(createUserDto.getUserName());

        return user;
    }

}
