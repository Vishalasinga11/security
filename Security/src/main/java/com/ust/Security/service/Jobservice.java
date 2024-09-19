package com.ust.Security.service;

import com.ust.Security.model.Job;
import com.ust.Security.repository.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Jobservice {
    @Autowired
    private Jobrepo jobrepo;

    public Job addJob(Job job) {
        return jobrepo.save(job);
    }

    public List<Job> getallJobs() {
        return jobrepo.findAll();
    }
}
