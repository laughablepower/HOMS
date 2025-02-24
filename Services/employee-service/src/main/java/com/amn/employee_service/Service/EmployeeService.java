package com.amn.employee_service.Service;

import com.amn.employee_service.entity.Employee;
import com.amn.employee_service.payload.EmployeeDepartment;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    Employee addEmployee(Employee employee);
    EmployeeDepartment getEmployeeWithDepartment(int id);
}
