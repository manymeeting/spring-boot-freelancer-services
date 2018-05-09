package com.freelancer.spring.flbackend.dto.param;

import com.freelancer.spring.flbackend.entity.Bid;

import java.io.Serializable;

public class AddBidDto implements Serializable{

    private Integer projectId;

    private Integer bidderId;

    private Integer employerId;

    private String bidPeriod;

    private String bidDate;

    private Integer bidPrice;

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


    // employer, bidder, and project are supposed to be appended by caller
    public static Bid toBid(AddBidDto addBidDto)
    {
        Bid bid = new Bid();
        bid.setBidDate(addBidDto.getBidDate());
        bid.setBidPeriod(addBidDto.getBidPeriod());
        bid.setBidPrice(addBidDto.getBidPrice());
        return bid;
    }

}
