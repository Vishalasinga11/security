package com.ust.Security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.aot.generate.GeneratedTypeReference;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int jobId;
    public String jobTitle;
    public String jobDescription;
    public String jobType;
    public String joblocation;
    public String jobposteddate;
    public String jobskills;
    public String jobpackage;

}
