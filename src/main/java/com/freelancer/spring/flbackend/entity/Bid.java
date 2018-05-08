package com.freelancer.spring.flbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="bids")
public class Bid implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bid_id")
    private Integer bidId;

    @ManyToOne
    @JoinColumn(name="project_id")
    @JsonIgnore
    private Project project;

    @ManyToOne
    @JoinColumn(name="bidder_id")
    @JsonIgnore
    private User bidder;

    @ManyToOne
    @JoinColumn(name="employer_id")
    @JsonIgnore
    private User employer;

    @OneToOne(mappedBy = "hiredBid")
    @JsonIgnore
    private Project hiredByProject;

    @NotNull
    @Column(name="bid_period")
    private String bidPeriod;

    @NotNull
    @Column(name="bid_date")
    private String bidDate;

    @NotNull
    @Column(name="bid_price")
    private Integer bidPrice;

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getBidder() {
        return bidder;
    }

    public void setBidder(User bidder) {
        this.bidder = bidder;
    }

    public User getEmployer() {
        return employer;
    }

    public void setEmployer(User employer) {
        this.employer = employer;
    }

    public String getBidPeriod() {
        return bidPeriod;
    }

    public void setBidPeriod(String bidPeriod) {
        this.bidPeriod = bidPeriod;
    }

    public String getBidDate() {
        return bidDate;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }

    public Integer getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Integer bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Project getHiredByProject() {
        return hiredByProject;
    }

    public void setHiredByProject(Project hiredByProject) {
        this.hiredByProject = hiredByProject;
    }

}
