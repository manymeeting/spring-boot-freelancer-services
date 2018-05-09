package com.freelancer.spring.flbackend.dao;

import com.freelancer.spring.flbackend.entity.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectDao extends PagingAndSortingRepository<Project, Integer> {

    @Query("select p from Project p join p.employer e where e.userId = :userId")
    List<Project> getAllProjPublishedByUser(@Param("userId") Integer userId);

    @Query("select p from Project p join p.bids b where b.bidder.userId = :userId")
    List<Project> getAllProjBiddedByUser(@Param("userId") Integer userId);

    @Query("select p from Project p where p.status = :status")
    List<Project> getAllProjOnStatus(@Param("status") String status);

    @Query("select p from Project p where p.projectId = :projectId")
    Project getProjectDetails(@Param("projectId") Integer projectId);
}
