package com.freelancer.spring.flbackend.service.impl;


import com.freelancer.spring.flbackend.dao.BidDao;
import com.freelancer.spring.flbackend.dao.ProjectDao;
import com.freelancer.spring.flbackend.dao.UserDao;
import com.freelancer.spring.flbackend.dto.BidDto;
import com.freelancer.spring.flbackend.dto.param.AddBidDto;
import com.freelancer.spring.flbackend.entity.Bid;
import com.freelancer.spring.flbackend.entity.Project;
import com.freelancer.spring.flbackend.entity.User;
import com.freelancer.spring.flbackend.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService{

    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private BidDao bidDao;

    @Autowired
    private UserDao userDao;

    @Override
    public BidDto addBidOnProject(AddBidDto addBidDto) {
        Bid bid = AddBidDto.toBid(addBidDto);

        User employer = userDao.findUserById(addBidDto.getEmployerId());
        if(employer != null) bid.setEmployer(employer);

        User bidder = userDao.findUserById(addBidDto.getBidderId());
        if(bidder != null) bid.setBidder(bidder);

        Project project = projectDao.getProjectDetails(addBidDto.getProjectId());
        if(project != null) bid.setProject(project);

        return BidDto.toBidDto(bid);
    }
}
