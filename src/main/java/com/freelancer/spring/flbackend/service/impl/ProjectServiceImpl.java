package com.freelancer.spring.flbackend.service.impl;

import com.freelancer.spring.flbackend.dao.ProjectDao;
import com.freelancer.spring.flbackend.dao.UserDao;
import com.freelancer.spring.flbackend.dto.ProjectDto;
import com.freelancer.spring.flbackend.entity.Project;
import com.freelancer.spring.flbackend.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDao projectDao;

    @Override
    public List<ProjectDto> getAllProjPublishedByUser(Integer userId) {
        List<Project> projects = projectDao.getAllProjPublishedByUser(userId);

        List<ProjectDto> projectDtos = projects.stream()
                .map( project-> ProjectDto.toProjectDto(project))
                .collect(Collectors.toList());

        return projectDtos;
    }

    @Override
    public List<ProjectDto> getAllProjBiddedByUser(Integer userId) {
        List<Project> projects = projectDao.getAllProjBiddedByUser(userId);

        List<ProjectDto> projectDtos = projects.stream()
                .map( project-> ProjectDto.toProjectDto(project))
                .collect(Collectors.toList());

        return projectDtos;
    }

    @Override
    public List<ProjectDto> getAllProjOnStatus(String status) {
        List<Project> projects = projectDao.getAllProjOnStatus(status);

        List<ProjectDto> projectDtos = projects.stream()
                .map( project-> ProjectDto.toProjectDto(project))
                .collect(Collectors.toList());

        return  projectDtos;
    }
}
