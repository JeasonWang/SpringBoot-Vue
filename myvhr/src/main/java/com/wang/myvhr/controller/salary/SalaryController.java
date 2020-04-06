package com.wang.myvhr.controller.salary;

import com.wang.myvhr.model.RespBean;
import com.wang.myvhr.model.RespPageBean;
import com.wang.myvhr.model.Salary;
import com.wang.myvhr.service.EmployeeService;
import com.wang.myvhr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary/")
public class SalaryController {
    @Autowired
    SalaryService salaryService;
    @Autowired
    EmployeeService employeeService;
    @GetMapping("sob/")
    public List<Salary> getAllSalaries(){
        return salaryService.getAllSalaries();
    }
    @GetMapping("sobcfg/")
    public RespPageBean getSalarySConfig(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        System.out.println(page);
        RespPageBean respPageBean = employeeService.getEmployeeByPageWithSalary(page,size);
        return respPageBean;
    }
    @GetMapping("sobcfg/salaries")
    public List<Salary> getSalarySConfigSalaries(){
        return salaryService.getAllSalaries();
    }
    @PutMapping("sobcfg/")
    public RespBean updateEmployeeSalaryById(Integer eid, Integer sid) {
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
        if (result == 1 || result == 2) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
