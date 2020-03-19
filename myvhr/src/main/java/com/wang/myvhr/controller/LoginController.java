package com.wang.myvhr.controller;

import com.wang.myvhr.model.RespBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public RespBean login(){
        return RespBean.error("未登录");
    }
}
