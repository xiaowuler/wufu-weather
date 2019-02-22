package com.pingchuan.wufu.userclient.Dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.pingchuan.Model.Organization;

@Mapper
public interface OrganizationMapper {

    void insert(Organization organization);
    
    void delete(Organization organization);
    
    void updateById(Organization organization);
    
    List<Organization> findAll();
}