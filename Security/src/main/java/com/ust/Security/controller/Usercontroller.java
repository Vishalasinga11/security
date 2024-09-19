package com.ust.Security.controller;

import com.ust.Security.model.Job;
import com.ust.Security.model.UserInfo;
import com.ust.Security.service.Jobservice;
import com.ust.Security.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secure")
public class Usercontroller {

    @Autowired
    private Userservice userservice;
    private Jobservice jobservice;
    @PostMapping("/adduser")
    public UserInfo adduser(@RequestBody UserInfo user){
        return userservice.addUser(user);
    }

    @PostMapping("/addjob")
    public Job addjob(@RequestBody Job job){
        return jobservice.addJob(job);
    }

    @GetMapping("/getalljobs")
    public List<Job> getall(){
        return jobservice.getallJobs();
    }
}
