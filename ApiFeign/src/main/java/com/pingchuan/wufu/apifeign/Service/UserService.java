package com.pingchuan.wufu.apifeign.Service;

import com.github.pagehelper.PageInfo;
import com.pingchuan.Model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("UserClient")
public interface UserService {

    @RequestMapping("/user/findAllByPage")
    PageInfo<User> findAllByPage(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize);

    @RequestMapping("/user/findOneByUsernameAndPassword")
    User findOneByUsernameAndPassword(@RequestParam("username") String username, @RequestParam("password") String password);
}
