package com.freelancer.spring.flbackend.controller;

import com.freelancer.spring.flbackend.dto.ProjectDto;
import com.freelancer.spring.flbackend.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
