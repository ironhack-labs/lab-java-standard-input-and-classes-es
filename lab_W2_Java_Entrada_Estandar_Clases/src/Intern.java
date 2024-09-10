//Clases Intern
//Crea una clase Intern que extienda de Employee. La clase Intern debe tener un límite de salario de 20000 (constante).

// src/Intern.java
public class Intern extends Employee {
    private static final double MAX_SALARY = 20000.0;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("An intern's salary cannot exceed " + MAX_SALARY );
        }
    }
    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("An intern's salary cannot exceed " + MAX_SALARY);
        }
        super.setSalary(salary);
    }
}
