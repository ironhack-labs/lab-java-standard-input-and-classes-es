public class Intern extends Employee {
    private static final double MAX_SALARY = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("El salario no puede exceder el monto de " + MAX_SALARY);
        }
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("El salario no puede exceder el monto de " + MAX_SALARY);
        }
        super.setSalary(salary);
    }
}
