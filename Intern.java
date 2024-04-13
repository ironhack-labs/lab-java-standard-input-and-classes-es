package com.ironhack.employeemanagement;
// Import the Employee class from the employeemanagement package
import com.ironhack.employeemanagement.Employee;

// Intern class that extends the Employee class
public class Intern extends Employee {

    // Define a constant for the salary cap of an Intern
    public static final double SALARY_CAP = 20000;

    // Constructor for the Intern class that calls the constructor of the Employee class
    // and validates the salary of the Intern object
    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        EmployeeValidator.validateSalary(this);
    }

    // Override the setSalary method of the Employee class to validate the salary
    // of the Intern object before setting the new salary
    @Override
    public void setSalary(double salary) {
        EmployeeValidator.validateSalary(this, salary);
        super.setSalary(salary);
    }
}
