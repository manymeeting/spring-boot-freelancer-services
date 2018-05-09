package com.freelancer.spring.flbackend.service;

import com.freelancer.spring.flbackend.dto.ProjectDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProjectService {

    List<ProjectDto> getAllProjPublishedByUser(Integer userId);

    List<ProjectDto> getAllProjBiddedByUser(Integer userId);

    List<ProjectDto> getAllProjOnStatus(String status);


}
