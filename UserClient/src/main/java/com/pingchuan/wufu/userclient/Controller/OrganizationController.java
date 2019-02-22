package com.pingchuan.wufu.userclient.Controller;

import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pingchuan.Model.Organization;
import com.pingchuan.wufu.userclient.Service.OrganizationService;

@RestController
@RequestMapping("/organization")
public class OrganizationController{

    @Autowired
    private OrganizationService organizationService;
    
    @RequestMapping("/insert")
    public void insert(Organization organization){
        organizationService.insert(organization);
    }
    
    @RequestMapping("/delete")
    public void delete(Organization organization){
        organizationService.delete(organization);
    }
    
    @RequestMapping("/updateById")
    public void updateById(Organization organization){
        organizationService.updateById(organization);
    }
    
    @RequestMapping("/findAllByPage")
    public PageInfo<Organization> findAllByPage(int pageNum, int pageSize){
        return organizationService.findAllByPage(pageNum, pageSize);
    }
}
