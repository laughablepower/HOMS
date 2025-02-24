package com.amn.department.service.Service;

import com.amn.department.service.Entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(int id);
    Department saveDepartment(Department department);
}
