package com.freelancer.spring.flbackend.service;

import com.freelancer.spring.flbackend.dto.BidDto;
import com.freelancer.spring.flbackend.dto.param.AddBidDto;

public interface BidService {

    BidDto addBidOnProject(AddBidDto addBidDto);
}
