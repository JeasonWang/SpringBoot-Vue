package com.wang.myvhr.mapper;

import com.wang.myvhr.model.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentMapper {
    public List<Department> getAllDepartments();
}
