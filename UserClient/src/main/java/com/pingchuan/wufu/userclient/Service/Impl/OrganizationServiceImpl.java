package com.pingchuan.wufu.userclient.Service.Impl;

import java.util.List;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.pingchuan.Model.Organization;
import com.pingchuan.wufu.userclient.Dao.OrganizationMapper;
import com.pingchuan.wufu.userclient.Service.OrganizationService;

@Service
@Transactional
public class OrganizationServiceImpl implements OrganizationService{

    @Autowired
    private OrganizationMapper organizationMapper;

    public void insert(Organization organization){
        organizationMapper.insert(organization);
    }
    
    public void delete(Organization organization){
        organizationMapper.delete(organization);
    }
    
    public void updateById(Organization organization){
        organizationMapper.updateById(organization);
    }
    
    public PageInfo<Organization> findAllByPage(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Organization> organizations = organizationMapper.findAll();
        return new PageInfo<>(organizations);
    }
}