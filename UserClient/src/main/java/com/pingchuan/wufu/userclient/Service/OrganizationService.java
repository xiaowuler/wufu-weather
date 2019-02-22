package com.pingchuan.wufu.userclient.Service;

import com.github.pagehelper.PageInfo;
import com.pingchuan.Model.Organization;


public interface OrganizationService{

    void insert(Organization organization);
    
    void delete(Organization organization);
    
    void updateById(Organization organization);
    
    PageInfo<Organization> findAllByPage(int pageNum, int pageSize);
}