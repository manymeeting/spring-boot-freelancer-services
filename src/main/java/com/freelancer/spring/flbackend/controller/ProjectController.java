package com.freelancer.spring.flbackend.controller;

import com.freelancer.spring.flbackend.dto.ProjectDto;
import com.freelancer.spring.flbackend.dto.param.CreateProjectDto;
import com.freelancer.spring.flbackend.service.ProjectService;
import com.freelancer.spring.flbackend.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional(rollbackFor = Exception.class)
public class ProjectController extends GenericController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/projects/publisher/{userId}")
    public ResponseEntity getAllProjPublishedByUser(@PathVariable Integer userId) {
        List<ProjectDto> projectDtoList = projectService.getAllProjPublishedByUser(userId);

        if (projectDtoList != null)
            return success(projectDtoList);
        return notFound();
    }

    @GetMapping("/projects/bidder/{userId}")
    public ResponseEntity getAllProjBiddedByUser(@PathVariable Integer userId) {
        List<ProjectDto> projectDtoList = projectService.getAllProjBiddedByUser(userId);

        if (projectDtoList != null)
            return success(projectDtoList);
        return notFound();
    }

    @GetMapping("/projects/status/{status}")
    public ResponseEntity getAllProjOnStatus(@PathVariable String status) {
        List<ProjectDto> projectDtoList = projectService.getAllProjOnStatus(status);
        if (projectDtoList != null)
            return success(projectDtoList);
        return notFound();
    }

    @GetMapping("/projects/{projectId}")
    public ResponseEntity getProjectDetails(@PathVariable Integer projectId) {
        ProjectDto projectDto = projectService.getProjectDetails(projectId);

        if (projectDto != null)
            return success(projectDto);
        return notFound();
    }

    @PutMapping("/projects/{projectId}/hire/{bidId}")
    public ResponseEntity hireBid(@PathVariable Integer projecId, @PathVariable Integer bidId) {

        ProjectDto projectDto = projectService.hireBid(projecId, bidId);
        if (projectDto != null)
            return success(projectDto);
        return badRequest();
    }

    @PostMapping("/projects")
    public ResponseEntity postProject(@RequestBody CreateProjectDto createProjectDto)
    {
        //check validity
        if(StringUtils.checkIfNullOrEmpty(createProjectDto.getProjectDescription())
                || StringUtils.checkIfNullOrEmpty(createProjectDto.getProjectName())
                || createProjectDto.getEmployerId() == null)
        {
            return badRequest();
        }

        ProjectDto projectDto = projectService.postProject(createProjectDto);
        if(projectDto != null)
            return success(projectDto);

        return badRequestWithtMsg("Failed to create this project");
    }

}
