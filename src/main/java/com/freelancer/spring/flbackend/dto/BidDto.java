package com.freelancer.spring.flbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.freelancer.spring.flbackend.entity.Bid;

import java.io.Serializable;

public class BidDto implements Serializable {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer bidId;

    private Integer projectId;

    private Integer bidderId;

    private Integer employerId;

    private String bidPeriod;

    private String bidDate;

    private Integer bidPrice;

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getBidderId() {
        return bidderId;
    }

    public void setBidderId(Integer bidderId) {
        this.bidderId = bidderId;
    }

    public Integer getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Integer employerId) {
        this.employerId = employerId;
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

    public static BidDto toBidDto(Bid bid)
    {
        if (bid == null) return null;

        BidDto bidDto = new BidDto();
        bidDto.setBidDate(bid.getBidDate());
        bidDto.setBidderId(bid.getBidId());
        bidDto.setBidPeriod(bid.getBidPeriod());
        bidDto.setBidPrice(bid.getBidPrice());
        bidDto.setEmployerId(bid.getEmployer().getUserId());
        bidDto.setProjectId(bid.getProject().getProjectId());
        
        return bidDto;
    }
}
