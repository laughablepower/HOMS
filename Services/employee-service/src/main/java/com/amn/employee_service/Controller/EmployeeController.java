package com.amn.employee_service.Controller;

import com.amn.employee_service.Service.EmployeeService;
import com.amn.employee_service.entity.Employee;
import com.amn.employee_service.payload.EmployeeDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/employees")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        var employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
        var employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        var data = employeeService.addEmployee(employee);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

    @GetMapping("/{id}/department")
    public ResponseEntity<EmployeeDepartment> getEmployeeWithDepartment(@PathVariable("id") int id) {
        var data = employeeService.getEmployeeWithDepartment(id);
        return ResponseEntity.ok(data);
    }
}
