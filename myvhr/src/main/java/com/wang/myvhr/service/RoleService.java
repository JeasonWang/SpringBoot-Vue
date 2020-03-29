package com.wang.myvhr.service;

import com.wang.myvhr.mapper.RoleMapper;
import com.wang.myvhr.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    public List<Role> getAllRoles(){
        return roleMapper.getAllRoles();
    }
}
