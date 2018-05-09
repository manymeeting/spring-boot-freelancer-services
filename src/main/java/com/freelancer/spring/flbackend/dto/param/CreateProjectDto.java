package com.freelancer.spring.flbackend.dto.param;

import com.freelancer.spring.flbackend.entity.Project;

import java.io.Serializable;

public class CreateProjectDto implements Serializable {

    private String projectName;

    private Integer employerId;

    private String projectDescription;

    private String projectSkills;

    private String projectFiles;

    private String budgetRange;

    private String publishedDate;

    private String status;

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

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
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

    public String getProjectFiles() {
        return projectFiles;
    }

    public void setProjectFiles(String projectFiles) {
        this.projectFiles = projectFiles;
    }


    // project employer is supposed to be set by callers
    public static Project toProject(CreateProjectDto createProjectDto)
    {
        Project project = new Project();

        project.setBudgetRange(createProjectDto.getBudgetRange());
        project.setProjectDescription(createProjectDto.getProjectDescription());
        project.setProjectName(createProjectDto.getProjectName());
        project.setProjectFiles(createProjectDto.getProjectFiles());
        project.setBudgetRange(createProjectDto.getBudgetRange());
        project.setPublishedDate(createProjectDto.getPublishedDate());
        project.setStatus(createProjectDto.getStatus());
        project.setProjectSkills(createProjectDto.getProjectSkills());

        return project;
    }

}
