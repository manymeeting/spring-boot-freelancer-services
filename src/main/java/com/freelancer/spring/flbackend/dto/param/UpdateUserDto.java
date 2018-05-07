package com.freelancer.spring.flbackend.dto.param;

import com.freelancer.spring.flbackend.entity.User;

import java.io.Serializable;

public class UpdateUserDto implements Serializable {
    private String userName;

    private String userPassword;

    private String userEmail;

    private String userAvatarUrl;

    private String userPhone;

    private String userAbout;

    private String userSkills;

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

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAbout() {
        return userAbout;
    }

    public void setUserAbout(String userAbout) {
        this.userAbout = userAbout;
    }

    public String getUserSkills() {
        return userSkills;
    }

    public void setUserSkills(String userSkills) {
        this.userSkills = userSkills;
    }

    public static User updateUser(User user, UpdateUserDto updateUserDto)
    {
        user.setUserEmail(updateUserDto.getUserEmail());
        user.setUserPassword(updateUserDto.getUserPassword());
        user.setUserName(updateUserDto.getUserName());
        user.setUserAvatarUrl(updateUserDto.getUserAvatarUrl());
        user.setUserAbout(updateUserDto.getUserAbout());
        user.setUserPhone(updateUserDto.getUserPhone());
        user.setUserSkills(updateUserDto.getUserSkills());

        return user;
    }
}
