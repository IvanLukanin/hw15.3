package com.example.controller;

import com.example.collectionandsets1.Employee;
import com.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class DepartmentService {
    private final EmployeeService employeeService;

    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee max(int dept) {
        return employeeService.getEmployess()
                .stream()
                .filter(e -> e.getDepartment() == dept)
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }

    public Employee max(int dept) {
        return employeeService.getEmployees()
                .stream()
                .filter(e -> e.getDepartment() == dept)
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }

    public Employee min(int dept) {
        return employeeService.getEmployees()
                .stream()
                .filter(e -> e.getDepartment() == dept)
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }

    public Collection<Employee> allByDept(int dept) {
        return employeeService.getEmployees()
                .stream()
                .filter(e -> e.getDepartment() == dept)
                .collect(Collectors.toList());
    }
    public Map<Integer, List<Employee» all() return employeeService.getEmployees(){
                .stream/)
                .collect (groupingBy(Employee :: getDepartment));
    }
}
