package com.ust.Security.repository;

import com.ust.Security.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<UserInfo,Integer> {
}
