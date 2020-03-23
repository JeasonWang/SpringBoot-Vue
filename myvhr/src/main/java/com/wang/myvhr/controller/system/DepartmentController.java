package com.wang.myvhr.controller.system;

import com.wang.myvhr.model.Department;
import com.wang.myvhr.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/basic")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/department")
    public List<Department> getAllDepartments(){
        List<Department> departments = departmentService.getAllDepartments();
        return departments;
    }
}
