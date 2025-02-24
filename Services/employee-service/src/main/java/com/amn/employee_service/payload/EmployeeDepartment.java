package com.amn.employee_service.payload;

import com.amn.employee_service.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDepartment {
    Employee employee;
    Department department;

}
