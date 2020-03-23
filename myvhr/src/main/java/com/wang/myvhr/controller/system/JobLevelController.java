package com.wang.myvhr.controller.system;

import com.wang.myvhr.model.JobLevel;
import com.wang.myvhr.service.JobLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/basic/joblevel")
public class JobLevelController {
    @Autowired
    JobLevelService jobLevelService;
    @GetMapping("/")
    public List<JobLevel> getAllJobLevels(){
        return jobLevelService.getAllJobLevels();
    }
}
