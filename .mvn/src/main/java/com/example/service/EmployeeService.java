package com.example.service;

import com.example.collectionandsets1.Employee;
import com.example.exeption.EmployeeAlreadyAddedExeption;
import com.example.exeption.EmployeeNotFoundExeption;
import com.example.exeption.EmployeeStoragesFullExeption;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class EmployeeService {
    private static final int MAX_SIZE = 100;
    private final List<Employee> employees = new ArrayList<>(MAX_SIZE);
    public Employee add(String firstName, String lastName){
        if (!validateInput (firstName, lastName)) {
            throw new IllegalArgumentException();
    }
        if (employees.size() > MAX_SIZE) {
            throw new EmployeeStoragesFullExeption();
        }
        var employee = new Employee(firstName, lastName, department, salary);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedExeption();
        }
        employees.add(employee);
        return employee;
    }
    public Employee delete(String firstName, String lastName){
        if (!validateInput (firstName, lastName)) {
            throw new IllegalArgumentException();
    }
        var employee = new Employee(firstName,lastName, department, salary);
        if (!employees.remove(employee)){
            throw new EmployeeNotFoundExeption();
        }
        return employee;
    }
    public Employee find(String firstName, String lastName){
        if (!validateInput (firstName, lastName)) {
            throw new IllegalArgumentException();
    }
        var employee = new Employee(firstName,lastName, department, salary);
        for (Employee emp : employees) {
            if (emp.equals(employee)){
                return emp;
            }
        }
        throw new EmployeeNotFoundExeption();
    }

    public Arrays getEmployess() {
    }

    private boolean validateInput (String firstName, String lastName) {
        return IsAlpha(firstName) && isAlpha(lastName);
}
