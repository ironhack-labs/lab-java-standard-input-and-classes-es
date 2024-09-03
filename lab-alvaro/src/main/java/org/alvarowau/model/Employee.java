package org.alvarowau.model;

/**
 * La clase {@code Employee} representa a un empleado de una empresa.
 * Contiene información básica sobre el empleado, como nombre, correo electrónico, edad y salario.
 */
public class Employee {
    private String name;
    private String email;
    private int age;
    private double salary;

    /**
     * Constructor de la clase {@code Employee}.
     * Inicializa un empleado con el nombre, correo electrónico, edad y salario proporcionados.
     *
     * @param name    El nombre del empleado.
     * @param email   El correo electrónico del empleado.
     * @param age     La edad del empleado.
     * @param salary  El salario del empleado.
     */
    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }


    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Devuelve una representación en cadena del empleado.
     * Incluye el nombre, correo electrónico, edad y salario.
     *
     * @return Una cadena que representa al empleado.
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s, Correo electrónico: %s, Edad: %d, Salario: %.2f", name, email, age, salary);
    }
}
