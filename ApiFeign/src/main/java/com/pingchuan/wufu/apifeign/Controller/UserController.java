package com.pingchuan.wufu.apifeign.Controller;

import com.github.pagehelper.PageInfo;
import com.pingchuan.Model.User;
import com.pingchuan.wufu.apifeign.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllByPage")
    public PageInfo<User> findAllByPage(int pageNum, int pageSize){
        return userService.findAllByPage(pageNum, pageSize);
    }

    @RequestMapping("/verification")
    public User verification(String username, String password){
        return userService.findOneByUsernameAndPassword(username, password);
    }
}
