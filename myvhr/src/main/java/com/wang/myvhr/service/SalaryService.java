package com.wang.myvhr.service;

import com.wang.myvhr.mapper.SalaryMapper;
import com.wang.myvhr.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {
    @Autowired
    SalaryMapper salaryMapper;
    public List<Salary> getAllSalaries(){
        return salaryMapper.getAllSalaries();
    }
}
