package com.liu.dao;

import com.liu.domain.User;

import java.util.List;

public interface UserMapper {
    void save(User user);
    List<User> findAll();
}
