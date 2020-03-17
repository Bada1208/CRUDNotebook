package com.sysoiev.service;

import com.sysoiev.model.Employee;

import java.util.List;

public interface EmployeeService {
    public void addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public void deleteEmployee(Integer employeeId);

    public Employee getEmployee(int employeeid);

    public Employee updateEmployee(Employee employee);
}
