package com.ironhack.employeemanagement;

// Employee class that represents an employee of a company
public class Employee {

    // Properties of an employee
    private String name;
    private String email;
    private int age;
    private double salary;

// Getters and Setters for each property

    // Constructor for the Employee class that initializes the properties
    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

// Getters and Setters for each property

    // Getter for the salary property
    public double getSalary() {
        return salary;
    }

    // Setter for the salary property
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method to print the properties of the Employee object
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
