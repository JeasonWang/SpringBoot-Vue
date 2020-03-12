package com.wang.myvhr.controller.config;

import com.wang.myvhr.bean.Hr;
import com.wang.myvhr.bean.Menu;
import com.wang.myvhr.common.HrUtils;
import com.wang.myvhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/config")
public class ConfigController {
    @Autowired
    MenuService menuService;
    @RequestMapping("/menu")
    public List<Menu> sysmenu(){
        return menuService.getMenusByHrId();
    }
    @RequestMapping("/hr")
    public Hr currentUser(){
        return HrUtils.getCurrentHr();
    }
}
