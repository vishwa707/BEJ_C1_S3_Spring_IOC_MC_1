package com.example.employees;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private int deptId;
    private String deptName;

    // Getters and Setters
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
