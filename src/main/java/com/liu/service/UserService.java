package com.liu.service;

import com.liu.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
}
