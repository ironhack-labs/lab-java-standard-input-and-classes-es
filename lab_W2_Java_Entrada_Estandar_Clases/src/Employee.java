//Clases Employee
//Crea una clase Employee para representar un empleado de una empresa. La clase debe tener las propiedades name, email, age, salary y los getters y setters apropiados.

// src/Employee.java
public class Employee {
    private String name;
    private String email;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Age: " + age + ", Salary: " + salary;
    }

}
