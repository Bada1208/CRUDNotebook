package com.sysoiev.dao;

import com.sysoiev.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    void addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    void deleteEmployee(Integer employeeId);

    Employee updateEmployee(Employee employee);

    Employee getEmployee(int employeeid);
}
