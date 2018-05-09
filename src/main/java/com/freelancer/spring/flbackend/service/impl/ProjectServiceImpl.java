package com.freelancer.spring.flbackend.service.impl;

import com.freelancer.spring.flbackend.dao.BidDao;
import com.freelancer.spring.flbackend.dao.ProjectDao;
import com.freelancer.spring.flbackend.dao.UserDao;
import com.freelancer.spring.flbackend.dto.BidDto;
import com.freelancer.spring.flbackend.dto.ProjectDto;
import com.freelancer.spring.flbackend.dto.param.CreateProjectDto;
import com.freelancer.spring.flbackend.entity.Bid;
import com.freelancer.spring.flbackend.entity.Project;
import com.freelancer.spring.flbackend.entity.User;
import com.freelancer.spring.flbackend.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private BidDao bidDao;

    @Autowired
    private UserDao userDao;

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

    @Override
    public ProjectDto getProjectDetails(Integer projectId) {
        Project project = projectDao.getProjectDetails(projectId);

        ProjectDto projectDto = ProjectDto.toProjectDto(project);

        return projectDto;
    }

    @Override
    public ProjectDto hireBid(Integer projectId, Integer bidId) {
        Project project = projectDao.getProjectDetails(projectId);

        Bid bid = bidDao.getBid(bidId);
        project.setHiredBid(bid);
        project = projectDao.save(project);

        return ProjectDto.toProjectDto(project);
    }

    @Override
    public ProjectDto postProject(CreateProjectDto createProjectDto) {

        Project project = CreateProjectDto.toProject(createProjectDto);
        if(createProjectDto.getEmployerId() != null)
        {
            User employer = userDao.findUserById(createProjectDto.getEmployerId());
            if(employer != null)
            {
                project.setEmployer(employer);
            }
        }
        return ProjectDto.toProjectDto(project);
    }
}
