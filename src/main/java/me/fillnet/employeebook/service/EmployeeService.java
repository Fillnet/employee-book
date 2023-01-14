package me.fillnet.employeebook.service;

import me.fillnet.employeebook.EmployeeBookApplication;
import me.fillnet.employeebook.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    private final Map<String, Employee> employees = new HashMap<>();

    public Collection<Employee> getAll() {
        return employees.values();
    }

    public Employee getById(String id) {
        if (employees.containsKey(id)) {
            return employees.get(id);
        } else {
            throw new RuntimeException(" No such elements");
        }
    }

    public Employee addEmployee(Employee employee) {
        if (employees.containsKey(employee.getId())) {
            throw new RuntimeException("Duplicate add");
        } else {
            employees.put(employee.getId(), employee);
        }
        return employee;
    }

    public Employee updateEmployee(String id, Employee employee) {
        Employee serviceEmployee = employees.get(id);
        if (serviceEmployee == null) {
            throw new RuntimeException("No such element");
        }serviceEmployee.setDepartment(employee.getDepartment());
        serviceEmployee.setSalary(employee.getSalary());
        return serviceEmployee;
    }

    public Employee removeEmployee(String id) {
        return employees.remove(id);
    }

}
