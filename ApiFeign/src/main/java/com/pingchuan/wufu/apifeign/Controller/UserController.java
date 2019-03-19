package com.pingchuan.wufu.apifeign.Controller;

import com.github.pagehelper.PageInfo;
import com.pingchuan.Model.User;
import com.pingchuan.wufu.apifeign.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "物流接口")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllByPage")
    public PageInfo<User> findAllByPage(int pageNum, int pageSize){
        return userService.findAllByPage(pageNum, pageSize);
    }

    @ApiOperation(value = "物流接口非第三方接口",notes = "物流接口非第三方接口",httpMethod = "GET")
    @RequestMapping("/verification")
    public User verification(String username, String password){
        return userService.findOneByUsernameAndPassword(username, password);
    }
}
