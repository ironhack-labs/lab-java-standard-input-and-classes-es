package com.ironhack.employeemanagement;
// Import necessary classes for reading from a file and handling exceptions
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Explanation of the file organization (SOLID principles):
Employee.java: Contains the Employee class representing an employee.
Intern.java: Contains the Intern class extending Employee with a salary cap.
EmployeeValidator.java: Contains the EmployeeValidator class for salary validation.
EmployeeGenerator.java: Contains the main class to generate employees and write to a file.
 */

public class EmployeeGenerator {
    public static void main(String[] args) {
        // Declare a variable to hold each line read from the employees.txt file
        String line;
        // Read the employees.txt file located inside the com.ironhack.employeemanagement package
        // Use a try-with-resources statement to automatically close the BufferedReader when done
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            // Read each line from the employees.txt file
            while ((line = reader.readLine()) != null) {
                // Split each line into an array of strings using the ',' delimiter
                String[] employeeData = line.split(", ");
                // Extract the name, email, age, and salary from the array
                String name = employeeData[0];
                String email = employeeData[1];
                int age = Integer.parseInt(employeeData[2].split("=")[1]);
                // Extract the salary value from the string by splitting it by the '=' sign
                String salaryStr = employeeData[3].split("=")[1];
                double salary = Double.parseDouble(salaryStr.replace("}", ""));

                // Declare a variable to hold the Employee object
                Employee employee;
                // Check if the salary is within the salary cap for an Intern object
                if (salary > Intern.SALARY_CAP) {
                    // If the salary is too high, create a new Employee object
                    employee = new Employee(name, email, age, salary);
                } else {
                    // If the salary is within the cap, create a new Intern object
                    employee = new Intern(name, email, age, salary);
                }

                // Print the details of the employee object
                System.out.println(employee);
            }
            // Close the BufferedReader to release the file resources
        } catch (IOException e) {
            // Handle any exceptions that may occur during file reading
            e.printStackTrace();
        }
    }
}