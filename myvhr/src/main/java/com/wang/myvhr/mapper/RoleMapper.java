package com.wang.myvhr.mapper;

import com.wang.myvhr.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    List<Role> getAllRoles();
}
