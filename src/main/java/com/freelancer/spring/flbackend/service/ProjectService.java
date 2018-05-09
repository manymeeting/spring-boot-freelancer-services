package com.freelancer.spring.flbackend.service;

import com.freelancer.spring.flbackend.dto.ProjectDto;
import com.freelancer.spring.flbackend.dto.param.CreateProjectDto;
import com.freelancer.spring.flbackend.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProjectService {

    List<ProjectDto> getAllProjPublishedByUser(Integer userId);

    List<ProjectDto> getAllProjBiddedByUser(Integer userId);

    List<ProjectDto> getAllProjOnStatus(String status);

    ProjectDto getProjectDetails(Integer projectId);

    ProjectDto hireBid(Integer projectId, Integer bidId);

    ProjectDto postProject(CreateProjectDto createProjectDto);


}
