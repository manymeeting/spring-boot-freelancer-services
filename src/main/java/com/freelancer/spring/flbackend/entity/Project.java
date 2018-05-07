package com.freelancer.spring.flbackend.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="project_id")
    private Integer projectId;

    @NotNull
    @Column(name="project_name")
    private String projectName;

    @NotNull
    @Column(name="employer_id")
    private String employerId;

    @Column(name="hired_bid_id")
    private String hiredBidId;

    @NotNull
    @Column(name="project_description")
    private String projectDescription;

    @Column(name="project_files")
    private String projectFiles;

    @Column(name="project_skills")
    private String projectSkills;

    @Column(name="budget_range")
    private String budgetRange;

    @Column(name="ave_bid_price")
    private String avrBidPrice;

    @NotNull
    @Column(name="published_date")
    private String publishedDate;

    @NotNull
    @Column(name="status")
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

    public String getEmployerId() {
        return employerId;
    }

    public void setEmployerId(String employerId) {
        this.employerId = employerId;
    }

    public String getHiredBidId() {
        return hiredBidId;
    }

    public void setHiredBidId(String hiredBidId) {
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

    public String getAvrBidPrice() {
        return avrBidPrice;
    }

    public void setAvrBidPrice(String avrBidPrice) {
        this.avrBidPrice = avrBidPrice;
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
}
