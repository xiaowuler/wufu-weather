package com.pingchuan.wufu.userclient.Service;

import com.github.pagehelper.PageInfo;
import com.pingchuan.Model.User;


public interface UserService{

    void insert(User user);
    
    void delete(User user);
    
    void updateById(User user);
    
    PageInfo<User> findAllByPage(int pageNum, int pageSize);

    User findOneByUsernameAndPassowr(String username, String password);

}