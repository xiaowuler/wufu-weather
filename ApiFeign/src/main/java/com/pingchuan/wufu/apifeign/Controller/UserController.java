package com.pingchuan.wufu.apifeign.Controller;

import com.github.pagehelper.PageInfo;
import com.pingchuan.Model.User;
import com.pingchuan.wufu.apifeign.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "用户接口")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllByPage")
    public PageInfo<User> findAllByPage(int pageNum, int pageSize){
        return userService.findAllByPage(pageNum, pageSize);
    }

    @ApiOperation(value = "根据用户信息校验用户",notes = "非第三方接口",httpMethod = "POST")
    @PostMapping("/verification")
    public User verification(
            @ApiParam(name="username",value = "用户名称",required = true)
            @RequestParam("username") String username,
            @ApiParam(name="password",value = "用户密码",required = true)
            @RequestParam("password") String password){
        return userService.findOneByUsernameAndPassword(username, password);
    }
}
