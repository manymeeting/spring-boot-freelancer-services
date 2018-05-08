package com.freelancer.spring.flbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="projects")
public class Project implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="project_id")
    private Integer projectId;

    @NotNull
    @Column(name="project_name")
    private String projectName;

    @ManyToOne
    @JoinColumn(name="employer_id")
    @JsonIgnore
    private User employer;

    @OneToOne
    @JoinColumn(name="hired_bid_id")
    @JsonIgnore
    private Bid hiredBid;

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
    private Integer avrBidPrice;

    @NotNull
    @Column(name="published_date")
    private String publishedDate;

    @NotNull
    @Column(name="status")
    private String status;

    @OneToMany(mappedBy = "project")
    @JsonIgnore
    private List<Bid> bids;

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

    public Integer getAvrBidPrice() {
        return avrBidPrice;
    }

    public void setAvrBidPrice(Integer avrBidPrice) {
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

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    public User getEmployer() {
        return employer;
    }

    public void setEmployer(User employer) {
        this.employer = employer;
    }

    public Bid getHiredBid() {
        return hiredBid;
    }

    public void setHiredBid(Bid hiredBid) {
        this.hiredBid = hiredBid;
    }

}
