package com.example.employees;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the Employee bean
        Employee employee = context.getBean(Employee.class);

        // Display Employee details
        employee.displayEmployeeDetails();
    }
}
