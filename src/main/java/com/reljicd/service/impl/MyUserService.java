package com.reljicd.service.impl;

import com.reljicd.model.User;
import com.reljicd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
@Service
public class MyUserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        // Encode plaintext password
        return userRepository.saveAndFlush(user);
    }
}
