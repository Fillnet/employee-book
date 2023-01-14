package me.fillnet.employeebook.controller;


import me.fillnet.employeebook.model.Employee;
import me.fillnet.employeebook.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public Collection<Employee> getAll() {
        return this.employeeService.getAll();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable("id") String id, @RequestBody Employee employee) {
        return this.employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public Employee removeEmployee(@PathVariable("id") String id) {
        return this.employeeService.removeEmployee(id);
    }
}
