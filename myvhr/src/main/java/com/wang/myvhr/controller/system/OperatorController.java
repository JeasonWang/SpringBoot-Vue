package com.wang.myvhr.controller.system;

import com.wang.myvhr.model.Hr;
import com.wang.myvhr.model.RespBean;
import com.wang.myvhr.model.Role;
import com.wang.myvhr.service.HrService;
import com.wang.myvhr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/system/hr")
public class OperatorController {
    @Autowired
    HrService hrService;
    @Autowired
    RoleService roleService;
    @GetMapping("/")
    public List<Hr> getAllHrs(String keywords) {
        return hrService.getAllHrs(keywords);
    }

    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

}
