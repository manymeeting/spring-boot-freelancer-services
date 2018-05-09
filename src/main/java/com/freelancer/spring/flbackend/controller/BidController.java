package com.freelancer.spring.flbackend.controller;

import com.freelancer.spring.flbackend.dto.BidDto;
import com.freelancer.spring.flbackend.dto.param.AddBidDto;
import com.freelancer.spring.flbackend.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional(rollbackFor = Exception.class)
public class BidController extends GenericController {
    @Autowired
    BidService bidService;

    @PostMapping("/bids")
    public ResponseEntity addBidOnProject(@RequestBody AddBidDto addBidDto)
    {
        //check validity
        if(addBidDto.getBidderId() == null
                || addBidDto.getEmployerId() == null
                || addBidDto.getProjectId() == null)
        {
            return badRequest();
        }

        BidDto bidDto = bidService.addBidOnProject(addBidDto);
        if(bidDto != null)
            return success(bidDto);

        return badRequestWithtMsg("Failed to add bid on project");
    }

}
