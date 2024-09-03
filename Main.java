import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader (new FileReader("empleados_input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String email = parts [1];
                int age = Integer.parseInt(parts[2]);
                double salary = Double.parseDouble(parts[3]);
                String tipo = parts[4];

                if (tipo.equalsIgnoreCase("Employee")) {
                    employees.add(new Employee(name, email, age, salary));
                } else if (tipo.equalsIgnoreCase("Intern")) {
                    try {
                        employees.add(new Intern(name, email, age, salary));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error creando Intern: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato de archivo de entrada.");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"))) {
            for (Employee employee : employees) {
                writer.write("Name: " + employee.getName() +
                        ", Email: " + employee.getEmail() +
                        ", Age: " + employee.getAge() +
                        ", Salary: " + employee.getSalary());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}