package com.divyan.porcoms_backend.Controller;


import com.divyan.porcoms_backend.Models.Application;
import com.divyan.porcoms_backend.Services.ApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationsController {

    @Autowired
    private ApplicationsService applicationsService;


    @GetMapping("/all")
    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> applications=applicationsService.getAllApplication();
        return ResponseEntity.status(HttpStatus.OK).body(applications);
    }

}
