package com.example.employees;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        Employee emp = new Employee(department());
        emp.setEmployeeId(101);
        emp.setEmployeeName("Prajwal");
        emp.setEmployeeDOB("1990-01-01");
        return emp;
    }

    @Bean
    public Department department() {
        Department dept = new Department();
        dept.setDeptId(10);
        dept.setDeptName("Computer Science");
        return dept;
    }
}
