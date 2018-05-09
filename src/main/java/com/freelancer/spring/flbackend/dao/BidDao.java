package com.freelancer.spring.flbackend.dao;

import com.freelancer.spring.flbackend.entity.Bid;
import com.freelancer.spring.flbackend.entity.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BidDao extends PagingAndSortingRepository<Bid, Integer> {
    @Query("select b from Bid where b.bidId= :bidId")
    Bid getBid(@Param("bidId") Integer bidId);

}
