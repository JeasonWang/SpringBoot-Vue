package com.wang.myvhr.service;

import com.wang.myvhr.mapper.JobLevelMapper;
import com.wang.myvhr.model.JobLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobLevelService {
    @Autowired
    JobLevelMapper jobLevelMapper;
    public List<JobLevel> getAllJobLevels(){
        return jobLevelMapper.getAllJobLevels();
    }
}
