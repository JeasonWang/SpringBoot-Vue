package com.wang.myvhr.mapper;

import com.wang.myvhr.model.Salary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryMapper {
    List<Salary> getAllSalaries();
}
