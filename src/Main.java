public class Main {
    public static void main(String[] args) {
        // HARDCODED
        int temperature = 41;
        int day = 3;
        int grade = 85;
        int age = 17;
        boolean hasLicence = true;
        boolean isAmerican = false;
        boolean isRaining = true;
        String[] names = {"Boris", "Nico", "Haroldo", "Sarai"};
        int[] numbers = {10, 20, 30, 40, 50};

        // simpleIf(temperature);
        // ifElse(temperature);
        // elseIf(temperature);
        // switchMethod(day);
        // ternary(age);
        // calculator(grade);

        // logicalOperators(age, hasLicence, isAmerican, isRaining);

        // forLoop();
        // whileLoop();
        // doWhileLoop();

        // firstSolution();
        // secondSolution();
        // onlyCharacterSolution();

        // declareAssignAndInitialize();
        // accessValueInArray(numbers);
        // resignValue(numbers);
        // arrayLength(numbers, names);
        // iterateArrays(names, numbers);
        // sum(numbers);
        // maxNumber();


        // arraysExercise();

        String strExample = "Hola";
        int length = strExample.length();
        System.out.println(length);

        char ch = strExample.charAt(0);
        System.out.println(ch);

        String sub = strExample.substring(0, 4);
        System.out.println(sub);

        String lower = strExample.toLowerCase();
        String upper = strExample.toUpperCase();
        System.out.println(lower);
        System.out.println(upper);

        System.out.println(strExample); //no modificamos strExample nunca

        String untrimmed = "  No spaces please   ";
        String trimmed = untrimmed.trim();
        System.out.println(untrimmed);
        System.out.println(trimmed);

        String replaced = strExample.replace('o', 'x');
        System.out.println(replaced);

        boolean startWith = strExample.startsWith("Ho");
        boolean endsWith = strExample.endsWith("a");
        System.out.println(startWith);
        System.out.println(endsWith);

        boolean contains = strExample.contains("la");
        System.out.println(contains);

        String namesExample = "Pepe-Maria-Luisa";
        String[] namesArray = namesExample.split("-");
        System.out.println(namesArray[0]);
        System.out.println(namesArray[1]);
        System.out.println(namesArray[2]);

        boolean isEqual = strExample.equals("hola");
        System.out.println(isEqual);
        isEqual = strExample.equalsIgnoreCase("hola");
        System.out.println(isEqual);
    }

    private static void simpleIf(int temperature) {
        // sentencias if

/*        if (condición){
            // código a ejecutar si la condición es verdadera
        }
*/

        if (temperature > 30) {
            System.out.println("It's warm!");
        }
    }

    private static void ifElse(int temperature) {
        // sentencias if-else

/*        if (condición){
            // código a ejecutar si la condición es verdadera
          } else {
            // código a ejecutar si la condición es falsa
          }
*/

        if (temperature > 30) {
            System.out.println("It's warm!");
        } else {
            System.out.println("It's not that warm...");
        }
    }

    private static void elseIf(int temperature) {
        // sentencias else-if

/*        if (condición1){
            // código a ejecutar si la condición1 es verdadera

          } else if (condición2){
            // código a ejecutar si la condición2 es verdadera

          } else {
            // código a ejecutar si la condición es falsa
          }
*/

        if (temperature > 40) {
            System.out.println("Careful, drink some water NOW!");

        } else if (temperature > 30) {
            System.out.println("It's warm!");

        } else if (temperature > 20) {
            System.out.println("It's a nice day!");

        } else {
            System.out.println("It's a bit cold");
        }
    }

    private static void switchMethod(int day) {
        // sentencias switch

/*        switch (variable) {
            case value1:
                // código a ejecutar si la variable es igual al value1
                break;
            case value2:
                // código a ejecutar si la variable es igual al value2
                break;
            // más casos si necesario
            default:
                // código a ejecutar si la variable no coincide con ninguno de los casos
        }
*/

        System.out.println("FIRST SWITCH");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This is not a day of the week");
        }

        System.out.println("SECOND, ARROW SWITCH");
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("This is not a day of the week");
        }

        // Cómo sería en else-if:

//        if (day == 1) {
//            System.out.println("Monday");
//        } else if (day == 2) {
//            System.out.println("Tuesday");
//        }
//        // ...
//        else {
//            System.out.println("This is not a day of the week");
//        }
    }

    private static void ternary(int age) {
        // ternarios , ternary -> forma compacta de if-else

        // variable = (condición) ? valorSiVerdadero : valorSiFalso;
        // condición ? siTrue : siFalse;

        String result = (age >= 18) ? "You're an adult" : "You're underage";
        System.out.println(result);


        // SCOPE - alcance
//        String result2;
//        if(age >= 18){
//            result2 = "You're an adult";
//        } else {
//            result2 = "You're underage";
//        }
//        System.out.println(result2);


        // ternario con varias condiciones (como el else-if)
        String result3 = (age < 13) ? "You're a child" :
                (age < 18) ? "You're a teenager" : "You're an adult";

        System.out.println(result3);
    }

    private static void calculator(int grade) {
        // comprobación de calificación válida
        if (grade < 0 || grade > 100) {
            System.out.println("Wrong grade, it must be between 0 y 100.");
        } else {

            if (grade >= 90) {
                System.out.println("Calificación: A");
            } else if (grade >= 80) {
                System.out.println("Calificación: B");
            } else if (grade >= 70) {
                System.out.println("Calificación: C");
            } else if (grade >= 60) {
                System.out.println("Calificación: D");
            } else {
                System.out.println("Calificación: F");
            }
        }
    }

    private static void logicalOperators(int age, boolean hasLicence, boolean isAmerican, boolean isRaining) {
        // && -> Y lógico -> TRUE && TRUE
        // || -> O lógico -> TRUE || FALSE - FALSE || TRUE

        if ((age >= 18 && hasLicence) ||
                (age >= 16 && hasLicence && isAmerican)) {
            System.out.println("You can drive");
        } else {
            System.out.println("You cannot drive");
        }

        // ! -> NO lógico

        if (!isAmerican) {
            System.out.println("You're not American");
        } else {
            System.out.println("You are American");
        }

//        if (isAmerican) {
//            System.out.println("You are American");
//        } else {
//            System.out.println("You're not American");
//        }

        if (!isRaining) {
            System.out.println("It's not raining, yay!");
        } else {
            System.out.println("Awww, it's raining :(");
        }
    }


    private static void forLoop() {
        // bucle FOR -> cuando sabemos cuántas veces queremos repetir el código

/*        for (inicialización; condición; actualización){
            // código a repetir
        }
        */

//        int number = 20;
//
//        number = number + 1;
//        number += 1;
//        number++;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println("------------");

        for (int i = 5; i >= 0; i--) {
            System.out.println("Number: " + i);
        }

        System.out.println("------------ BREAK");

        for (int i = 0; i <= 5; i++) {
            System.out.println("Number: " + i);
            if (i == 3) {
                break; // sale del bucle cuando i == 3
            }
            System.out.println("Aquí llego?");
        }

        System.out.println("------------ CONTINUE");

        for (int i = 0; i <= 5; i++) {
            System.out.println("Number: " + i);
            if (i == 3) {
                continue; // omite el código siguiente de esta iteración pero continua con la siguiente
            }
            System.out.println("Aquí llego?");
        }
    }

    private static void whileLoop() {
        // while - cuando/mientras -> repetir código siempre que una condición sea verdadera

/*        while (condición){
            // código a repetir
        }
*/

        System.out.println("WHILE LOOP");
        int counter = 6;
        while (counter <= 5) {
            System.out.println("Number " + counter);
            counter++;
        }
    }

    private static void doWhileLoop() {
        // do-while -> haz-mientras -> similar al while pero se ejecuta al menos una vez

/*        do {
            // código a repetir
        } while (condición);
*/

        System.out.println("DO-WHILE LOOP");
        int counter = 6;
        do {
            System.out.println("Number " + counter);
            counter++;
        } while (counter <= 5);
    }


    private static void firstSolution() {
        System.out.print("Hola");
        System.out.print(" aloha");
        System.out.println();

        // Bucle exterior para las filas (del 1 al 5)
        for (int i = 1; i <= 5; i++) {
            // Bucle interior para las columnas (del 1 al 5)
            for (int j = 1; j <= 5; j++) {
                // Imprimir el resultado de la multiplicación
                System.out.print(i * j + "\t");  // Utiliza \t para tabular los números
            }
            // Imprimir una nueva línea después de cada fila
            System.out.println();
        }
    }

    private static void secondSolution() {
        // Bucle exterior para las filas (del 1 al 5)
        for (int i = 1; i <= 5; i++) {

            String row = "";  // Cadena para construir cada fila

            // Bucle interior para las columnas (del 1 al 5)
            for (int j = 1; j <= 5; j++) {

                // Añadir el resultado de la multiplicación a la cadena
                row += (i * j) + "\t";  // Añadir tabulación después de cada número
            }

            // Imprimir la fila completa en una sola línea
            System.out.println(row);
        }
    }

    private static void onlyCharacterSolution() {
        // Bucle exterior para las filas (del 1 al 5)
        for (int i = 1; i <= 5; i++) {
            String row = "";  // Cadena para construir cada fila
            // Bucle interior para las columnas (del 1 al 5)
            for (int j = 1; j <= 5; j++) {

                // Añadir "A"
                row += "A\t";  // Añadir tabulación después de cada "A"
            }
            // Imprimir la fila completa en una sola línea
            System.out.println(row);
        }
    }


    private static void declareAssignAndInitialize() {
        // arreglos - arrays

        int[] numbers1; // declarar array
        int[] numbers2 = new int[5]; // asignar memoria - tamaño -> este array puede contener hasta 5 enteros
        int[] numbers3 = {13, 24, 1, 3, 89}; // inicializando el array

        // índice comienza desde 0 -> posición en el array
        // para numbers3 el tamaño es 5 pero la posición/indice máximo es 4
    }

    private static void accessValueInArray(int[] numbers) {
        // System.out.println(numbers[5]); // esto nos tirará un error
        //System.out.println(numbers[5-1]);
        System.out.println(numbers[4]);
    }

    private static void resignValue(int[] numbers) {
        System.out.println(numbers[1]);
        numbers[1] = 25; // reasignar el valor através de su índice
        System.out.println(numbers[1]);
    }

    private static void arrayLength(int[] numbers, String[] names) {
        int numbersLength = numbers.length; // para saber la longitud del array
        int namesLength = names.length;
        System.out.println("The numbers array length is " + numbersLength);
        System.out.println("The names array length is " + namesLength);
    }

    private static void iterateArrays(String[] names, int[] numbers) {
        System.out.println("My array's length is " + names.length);

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println("I'm accessing array's index number " + i + " and it's value is " + name);
        }

        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println("I'm accessing array's index number " + i + " and it's value is " + names[i]);
        }

        // bucle for mejorado
        for (String name : names) {
            System.out.println(name);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void sum(int[] numbers) {
        // int[] numbers = {10,25,30,40,50}; -> iteramos sobre este array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
            System.out.println(sum);
        }
        System.out.println(sum);
    }

    private static void maxNumber() {
        System.out.println("----- FINDING MAX NUMBER IN MY ARRAY -------");
        int[] numbers4 = {10, 50, 30, 40, 55};
        int max = numbers4[0];
        for (int i = 0; i < numbers4.length; i++) {

            if (numbers4[i] > max) {
                max = numbers4[i];
                System.out.println("I'm in the condition");
            }

            System.out.println(max);
        }
    }


    private static void arraysExercise() {
        // 1. Crear un array para almacenar 7 lecturas diarias de temperatura
        int[] temperatures = {23, 19, 25, 30, 18, 21, 26};

        // 2. Calcular la temperatura promedio
        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        //  para asegurarse de que la división se realice con precisión decimal
        double average = (double) sum / temperatures.length;
        System.out.println("Average temperature: " + average);

        // 3. Encontrar la temperatura más alta y más baja de la semana
        int maxTemp = temperatures[0];
        int minTemp = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
            }
            if (temperatures[i] < minTemp) {
                minTemp = temperatures[i];
            }
        }
        System.out.println("Highest temperature: " + maxTemp);
        System.out.println("Lowest temperature: " + minTemp);

        // 4. Contar cuántos días estuvieron por encima de la temperatura promedio
        int daysAboveAverage = 0;
        for (int temp : temperatures) {
            if (temp > average) {
                daysAboveAverage++;
            }
        }
        System.out.println("Days above average: " + daysAboveAverage);
    }
}