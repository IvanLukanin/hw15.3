package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/max-salary")
    public void max (@RequestParam int departmentID){}

    @GetMapping("/min-salary")
    public void min (@RequestParam int departmentID){}

    @GetMapping("/all")
    public void allByDept (@RequestParam int departmentID){}

    @GetMapping("/all")
    public void all (){}
}
