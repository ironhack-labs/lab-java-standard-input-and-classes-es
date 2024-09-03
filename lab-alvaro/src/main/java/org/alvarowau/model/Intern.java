package org.alvarowau.model;

/**
 * La clase {@code Intern} representa a un interno en una empresa, que es un tipo de {@link Employee}.
 * Un interno tiene un salario máximo permitido, el cual no puede exceder un valor específico.
 */
public class Intern extends Employee {
    private static final double MAX_SALARY = 20000;

    /**
     * Constructor de la clase {@code Intern}.
     * Inicializa un interno con el nombre, correo electrónico, edad y salario proporcionados.
     * Valida que el salario no exceda el máximo permitido.
     *
     * @param name    El nombre del interno.
     * @param email   El correo electrónico del interno.
     * @param age     La edad del interno.
     * @param salary  El salario del interno.
     * @throws IllegalArgumentException Si el salario excede el máximo permitido.
     */
    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, validateSalary(salary));
    }

    /**
     * Valida que el salario proporcionado no exceda el máximo permitido para un interno.
     *
     * @param salary El salario a validar.
     * @return El salario validado si está dentro del límite permitido.
     * @throws IllegalArgumentException Si el salario excede el máximo permitido.
     */
    private static double validateSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("El salario de un interno no puede exceder " + MAX_SALARY);
        }
        return salary;
    }

    /**
     * Establece el salario del interno.
     * Valida que el salario no exceda el máximo permitido antes de actualizarlo.
     *
     * @param salary El nuevo salario del interno.
     * @throws IllegalArgumentException Si el salario excede el máximo permitido.
     */
    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("El salario de un interno no puede exceder " + MAX_SALARY);
        }
        super.setSalary(salary);
    }
}
