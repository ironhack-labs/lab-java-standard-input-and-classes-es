//Clases de Employee e Intern

//Crea una clase Employee para representar un empleado de una empresa. La clase debe tener las propiedades name, email, age, salary y los getters y setters apropiados.

//Crea una clase Intern que extienda de Employee. La clase Intern debe tener un límite de salario de 20000 (constante).

//Implementa la validación en la clase Intern para garantizar que un interno no sea creado (o el salario actualizado) con un salario que exceda el valor máximo permitido.

//Escriba un programa que cree 10 objetos Employee y muestre todas sus propiedades (nombre, correo electrónico, edad, salario) en un archivo llamado employees.txt.

// src/Main.java
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lista de empleados
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Haroldo Oliveira", "haro@example.com", 30, 50000));
        employees.add(new Employee("Aleksandra Jablonska", "ale@example.com", 25, 40000));
        employees.add(new Employee("Gaetan Rohen", "gaetan@example.com", 28, 45000));
        employees.add(new Employee("Diana Brown", "diana@example.com", 35, 55000));
        employees.add(new Employee("Edward Wilson", "edward@example.com", 22, 35000));
        employees.add(new Employee("Fiona Martinez", "fiona@example.com", 27, 42000));
        employees.add(new Employee("George Clark", "george@example.com", 31, 47000));
        employees.add(new Employee("Hannah Lewis", "hannah@example.com", 26, 39000));
        employees.add(new Employee("Ian Walker", "ian@example.com", 29, 46000));
        employees.add(new Employee("Jenny Moore", "jenny@example.com", 32, 48000));

        // Guardar empleados en un archivo
        try (FileWriter writer = new FileWriter("employees.txt")) {
            for (Employee employee : employees) {
                writer.write(employee.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ejemplo de creación de un Intern válido y uno inválido
        try {
            Intern internValid = new Intern("Lisa Ironhack", "lisa_ironhack@example.com", 21, 18000);
            System.out.println(internValid);

            Intern internInvalid = new Intern("Sarah Adams", "sarah@example.com", 23, 25000);  // Esto lanzará una excepción
            System.out.println(internInvalid);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
