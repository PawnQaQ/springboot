package com.liu.service;

import com.liu.dao.UserMapper;
import com.liu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UseServiceImpl  implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    public void save(User user) {

        userMapper.save(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)//MyCat测试主从分离 查询操作只走从库
    public List<User> findAll() {

        return userMapper.findAll();
    }
}
