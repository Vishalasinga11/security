package com.ust.Security.repository;

import com.ust.Security.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Jobrepo extends JpaRepository<Job,Integer> {
}
