package com.wang.myvhr.mapper;

import com.wang.myvhr.model.JobLevel;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface JobLevelMapper {
    List<JobLevel> getAllJobLevels();
}
