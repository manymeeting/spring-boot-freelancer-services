package com.freelancer.spring.flbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.freelancer.spring.flbackend.entity.Project;

import java.io.Serializable;

public class ProjectDto implements Serializable {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer projectId;

    private String projectName;

    private Integer employerId;

    private String employerName;

    private String employerAvatarUrl;

    private Integer hiredBidId;

    private String projectDescription;

    private String projectFiles;

    private String projectSkills;

    private String budgetRange;

    private Integer aveBidPrice;

    private String publishedDate;

    private String status;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Integer employerId) {
        this.employerId = employerId;
    }

    public Integer getHiredBidId() {
        return hiredBidId;
    }

    public void setHiredBidId(Integer hiredBidId) {
        this.hiredBidId = hiredBidId;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectFiles() {
        return projectFiles;
    }

    public void setProjectFiles(String projectFiles) {
        this.projectFiles = projectFiles;
    }

    public String getProjectSkills() {
        return projectSkills;
    }

    public void setProjectSkills(String projectSkills) {
        this.projectSkills = projectSkills;
    }

    public String getBudgetRange() {
        return budgetRange;
    }

    public void setBudgetRange(String budgetRange) {
        this.budgetRange = budgetRange;
    }

    public Integer getAveBidPrice() {
        return aveBidPrice;
    }

    public void setAveBidPrice(Integer aveBidPrice) {
        this.aveBidPrice = aveBidPrice;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerAvatarUrl() {
        return employerAvatarUrl;
    }

    public void setEmployerAvatarUrl(String employerAvatarUrl) {
        this.employerAvatarUrl = employerAvatarUrl;
    }


    public static ProjectDto toProjectDto(Project project)
    {
        if(project == null) return null;

        ProjectDto projectDto = new ProjectDto();
        projectDto.setProjectId(project.getProjectId());
        projectDto.setProjectName(project.getProjectName());
        projectDto.setProjectDescription(project.getProjectDescription());
        projectDto.setEmployerId(project.getEmployer().getUserId());
        projectDto.setEmployerName(project.getEmployer().getUserName());
        projectDto.setEmployerAvatarUrl(project.getEmployer().getUserAvatarUrl());
        projectDto.setBudgetRange(project.getBudgetRange());
        projectDto.setProjectFiles(project.getProjectFiles());
        projectDto.setProjectSkills(project.getProjectSkills());
        projectDto.setAveBidPrice(project.getAvrBidPrice());

        return projectDto;
    }


}
