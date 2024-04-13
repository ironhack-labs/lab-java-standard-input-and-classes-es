package com.ironhack.employeemanagement;

// EmployeeValidator class responsible for validating salary for Interns
public class EmployeeValidator {

    // Method to validate the salary of an Intern object
    public static void validateSalary(Intern intern) {
        // Check if the salary of the Intern exceeds the salary cap
        if (intern.getSalary() > Intern.SALARY_CAP) {
            // Throw an exception if the salary exceeds the cap
            throw new IllegalArgumentException("Salary exceeds the cap of " + Intern.SALARY_CAP);
        }
    }

    // Method to validate a new salary for an Intern object
    public static void validateSalary(Intern intern, double newSalary) {
        // Check if the new salary exceeds the salary cap
        if (newSalary > Intern.SALARY_CAP) {
            // Throw an exception if the new salary exceeds the cap
            throw new IllegalArgumentException("Salary exceeds the cap of " + Intern.SALARY_CAP);
        }
    }
}
