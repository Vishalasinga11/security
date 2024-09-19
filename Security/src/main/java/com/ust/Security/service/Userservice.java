package com.ust.Security.service;

import com.ust.Security.model.UserInfo;
import com.ust.Security.repository.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    @Autowired
    private Userrepo userrepo;

    public UserInfo addUser(UserInfo user) {
        return userrepo.save(user);
    }
}
