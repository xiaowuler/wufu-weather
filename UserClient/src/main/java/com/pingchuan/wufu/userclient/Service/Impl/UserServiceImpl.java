package com.pingchuan.wufu.userclient.Service.Impl;

import java.util.List;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.pingchuan.Model.User;
import com.pingchuan.wufu.userclient.Dao.UserMapper;
import com.pingchuan.wufu.userclient.Service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public void insert(User user){
        userMapper.insert(user);
    }
    
    public void delete(User user){
        userMapper.delete(user);
    }
    
    public void updateById(User user){
        userMapper.updateById(user);
    }
    
    public PageInfo<User> findAllByPage(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.findAll();
        return new PageInfo<>(users);
    }

    public User findOneByUsernameAndPassowr(String username, String password){
        return userMapper.findOneByUsernameAndPassword(username, password);
    }
}