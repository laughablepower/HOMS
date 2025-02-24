package com.amn.employee_service.Service.impl;

import com.amn.employee_service.Repository.EmployeeRepository;
import com.amn.employee_service.Service.EmployeeService;
import com.amn.employee_service.entity.Employee;
import com.amn.employee_service.payload.Department;
import com.amn.employee_service.payload.EmployeeDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    RestTemplate restTemplate;
    /**
     * @return
     */
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }

    /**
     * @param employee
     * @return
     */
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public EmployeeDepartment getEmployeeWithDepartment(int id) {
    Employee employee = employeeRepository.findById(id).get();
    Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/api/departments/" + employee.getDepartmentId(), Department.class);
    EmployeeDepartment employeeDepartment = new EmployeeDepartment();
    employeeDepartment.setDepartment(department);
    employeeDepartment.setEmployee(employee);
    return employeeDepartment;
    }
}
