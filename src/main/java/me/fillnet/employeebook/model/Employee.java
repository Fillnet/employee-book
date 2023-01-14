package me.fillnet.employeebook.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@AllArgsConstructor
//@Getter
//@Setter
public class Employee {
    public final String id;
    private final String firstName;
    private final String lastName;
    private int department;
    private int salary;

    public Employee(String id, String firstName, String lastName, int department, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
