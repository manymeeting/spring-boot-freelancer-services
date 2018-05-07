package com.freelancer.spring.flbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.freelancer.spring.flbackend.entity.User;

import java.io.Serializable;

public class UserProfileDto implements Serializable{

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer userId;

    private String userName;

    private String userEmail;

    private String userAvatarUrl;

    private String userPhone;

    private String userAbout;

    private String userSkills;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public static UserProfileDto mapToUserProfileDto(User user) {

        if(user == null) return null;

        UserProfileDto UserProfileDto = new UserProfileDto();
        UserProfileDto.setUserId(user.getUserId());
        UserProfileDto.setUserAvatarUrl(user.getUserAvatarUrl());
        UserProfileDto.setUserEmail(user.getUserEmail());
        UserProfileDto.setUserName(user.getUserName());
        UserProfileDto.setUserPhone(user.getUserPhone());
        UserProfileDto.setUserAbout(user.getUserAbout());
        UserProfileDto.setUserSkills(user.getUserSkills());
        
        return UserProfileDto;
    }
}
