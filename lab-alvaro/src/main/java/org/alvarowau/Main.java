package org.alvarowau;

import org.alvarowau.model.Employee;
import org.alvarowau.model.Intern;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Genera una lista de empleados e internos, y escribe sus detalles en un archivo de texto.
 */
public class Main {
    private static final String FILE_NAME = "employees.txt";

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Verifica si el archivo de empleados ya existe, maneja la existencia del archivo,
     * genera una lista de empleados y escribe la información en el archivo.
     *
     */
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        if (isFileExists()) {
            handleExistingFile();
        }
        generateEmployees(employees);
        writeEmployeesToFile(employees); // Aquí llamamos al método sin el parámetro adicional
    }

    /**
     * Verifica si el archivo de empleados ya existe.
     *
     * @return {@code true} si el archivo existe, {@code false} en caso contrario.
     */
    private static boolean isFileExists() {
        File file = new File(FILE_NAME);
        return file.exists();
    }

    /**
     * Maneja la situación cuando el archivo de empleados ya existe.
     * Pregunta al usuario si desea borrar el archivo existente y empezar de nuevo,
     * o continuar con el archivo existente.
     */
    private static void handleExistingFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("El archivo '" + FILE_NAME + "' ya existe.");
        System.out.println("¿Desea borrar el archivo y empezar de nuevo (S/N)?");
        String response = scanner.nextLine().trim().toUpperCase();

        if (response.equals("S")) {
            File file = new File(FILE_NAME);
            if (file.delete()) {
                System.out.println("El archivo ha sido borrado. Se empezará de nuevo.");
            } else {
                System.out.println("No se pudo borrar el archivo. Continuando con el archivo existente.");
            }
        } else {
            System.out.println("Continuando con el archivo existente.");
        }
    }

    /**
     * Genera una lista de empleados e internos con datos aleatorios.
     * Se alterna entre crear un {@link Employee} y un {@link Intern}.
     *
     * @param employees La lista en la que se agregan los empleados generados.
     */
    private static void generateEmployees(List<Employee> employees) {
        List<String> names = Arrays.asList("Alvaro", "Sofia", "Carlos", "Maria", "Jorge", "Lucia", "Pedro", "Isabel", "Antonio", "Gabriela");
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String name = names.get(i);
            String email = name.trim().toLowerCase() + "@lab-alvaro.com";
            int age = 18 + random.nextInt(48); // Edad entre 18 y 65
            double salary = 1300 + (random.nextDouble() * (30000 - 1300)); // Salario entre 1300 y 30000

            if (i % 2 == 0) {
                employees.add(new Employee(name, email, age, salary));
            } else {
                try {
                    employees.add(new Intern(name, email, age, salary));
                } catch (IllegalArgumentException e) {
                    System.out.println("No se creó el interno: " + e.getMessage());
                }
            }
        }
    }

    /**
     * Escribe la lista de empleados en un archivo de texto.
     * Cada empleado se escribe en una línea separada en el archivo.
     *
     * @param employees La lista de empleados a escribir en el archivo.
     */
    private static void writeEmployeesToFile(List<Employee> employees) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            for (Employee e : employees) {
                writer.write(e.toString());
                writer.newLine();
            }
            System.out.println("La información de los empleados ha sido escrita en el archivo " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
