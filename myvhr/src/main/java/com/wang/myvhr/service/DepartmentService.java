package com.wang.myvhr.service;

import com.wang.myvhr.mapper.DepartmentMapper;
import com.wang.myvhr.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    public List<Department> getAllDepartments(){
        return this.departmentMapper.getAllDepartments();
    }
}
