package com.freelancer.spring.flbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;

    @NotNull
    @Column(name="user_name")
    private String userName;

    @NotNull
    @Column(name="user_email")
    private String userEmail;

    @NotNull
    @Column(name="user_password")
    private String userPassword;

    @Column(name="user_avatarurl")
    private String userAvatarUrl;

    @Column(name="user_phone")
    private String userPhone;

    @Column(name="user_about")
    private String userAbout;

    @Column(name="user_skills")
    private String userSkills;

    @OneToMany(mappedBy = "employer")
    @JsonIgnore
    private List<Project> publishedProjects;

    @OneToMany(mappedBy = "bidder")
    @JsonIgnore
    private  List<Bid> postedBids;

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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
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

    public List<Project> getPublishedProjects() {
        return publishedProjects;
    }

    public void setPublishedProjects(List<Project> publishedProjects) {
        this.publishedProjects = publishedProjects;
    }

    public List<Bid> getPostedBids() {
        return postedBids;
    }

    public void setPostedBids(List<Bid> postedBids) {
        this.postedBids = postedBids;
    }

}
