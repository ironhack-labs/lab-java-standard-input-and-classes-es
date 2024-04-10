
![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Entrada Estándar y Clases

## Introducción

Acabamos de aprender cómo usar entrada/salida en la consola y archivos, así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

### Clases de Employee e Intern

1. Crea una clase `Employee` para representar un empleado de una empresa. La clase debe tener las propiedades `name`, `email`, `age`, `salary` y los getters y setters apropiados.
2. Crea una clase `Intern` que extienda de `Employee`. La clase `Intern` debe tener un límite de salario de 20000 (constante).
3. Implementa la validación en la clase `Intern` para garantizar que un interno no sea creado (o el salario actualizado) con un salario que exceda el valor máximo permitido.
4. Escriba un programa que cree 10 objetos `Employee` y muestre todas sus propiedades (nombre, correo electrónico, edad, salario) en un archivo llamado `employees.txt`.

<br>

### Consejos

- Asegúrate de considerar la relación entre las clases `Employee` e `Intern` al diseñar tu solución.
- Piensa en las diferentes propiedades y comportamientos que son aplicables tanto a los objetos `Employee` como a `Intern` y considera cómo puedes usar la herencia para evitar la duplicación de código.
- Usa los modificadores de acceso apropiados (por ejemplo, `private`, `protected`, `public`) para controlar la visibilidad de tus propiedades y métodos de clase.
- Asegúrate de manejar los casos límite y tratarlos adecuadamente (por ejemplo, ¿qué sucede si se crea un objeto `Intern` con un salario que supera el valor máximo permitido?).

<br>

## FAQs (Preguntas frecuentes)

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">Estoy atascado y no sé cómo resolver el problema o por dónde empezar. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

  Si estás atascado en tu código y no sabes cómo resolver el problema o por dónde empezar, debes dar un paso atrás y tratar de formular una pregunta clara y directa sobre el problema específico que enfrentas. El proceso que seguirás al tratar de definir esta pregunta te ayudará a limitar el problema y a encontrar soluciones potenciales.

  Por ejemplo, ¿estás enfrentando un problema porque no entiendes el concepto o estás recibiendo un mensaje de error que no sabes cómo arreglar? Por lo general, es útil intentar formular el problema de la manera más clara posible, incluyendo cualquier mensaje de error que estés recibiendo. Esto puede ayudarte a comunicar el problema a otras personas y, potencialmente, a obtener ayuda de tus compañeros o recursos en línea.

  Una vez que tengas una comprensión clara del problema, deberías poder comenzar a trabajar hacia la solución.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo creo un proyecto Maven en IntelliJ?</summary>

  <!-- ✅ -->

  Para crear un proyecto Maven en IntelliJ, puedes seguir estos pasos:

   1. Abre IntelliJ IDEA y haz clic en el botón "Create New Project".
   2. En el diálogo "New Project", selecciona "Maven" como el sistema de compilación.
   3. Especifica el nombre del proyecto.
   4. En la sección "Project Location", especifica una ubicación donde quieres guardar tu proyecto.
   5. Selecciona la casilla de verificación "Create Git repository" para inicializar el repositorio git al crear el proyecto.
   6. Haz clic en el botón "Create" para crear el proyecto Maven.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Qué es la herencia en Java y cómo extiendo una clase a otra clase?</summary>

  <!-- ✅ -->

  La herencia en Java es un mecanismo que permite crear una nueva clase (la clase hijo) basada en una clase existente (la clase padre). La clase hijo hereda las propiedades y métodos de la clase padre, lo que significa que puede reutilizar el código y agregar nueva funcionalidad a la clase hijo.

  Para extender una clase a otra, se utiliza la palabra clave extends en la declaración de la clase hijo. La clase padre se especifica después de la palabra clave `extends`. Por ejemplo:

  ```java
  class ParentClass {
      int x;

      void display() {
          System.out.println("This is the ParentClass");
      }
  }

  class ChildClass extends ParentClass {
      int y;

      void display() {
          System.out.println("This is the ChildClass");
      }
  }
  ```

  En este ejemplo, `ChildClass` extiende a `ParentClass`, por lo que hereda la variable x y el método `display()`. También puede agregar nuevas propiedades y métodos a la clase hijo, como la variable y y el método `display()` que se sobreescribe en la clase hijo.

  Es importante tener en cuenta que la clase hijo puede acceder a todas las propiedades y métodos de la clase padre que tienen visibilidad pública o protegida. Las propiedades y métodos con visibilidad privada no son heredadas por la clase hijo.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es la diferencia entre usar "PrintWriter" y "FileWriter" en Java y cómo se pueden utilizar juntos?</summary>

  <!-- ✅ -->

  `PrintWriter` y `FileWriter` son dos clases en Java que se utilizan para escribir datos en un archivo. Sin embargo, tienen diferentes propósitos y características.

  `FileWriter` es una clase básica en Java que proporciona funciones simples de salida de archivo. Se puede usar para escribir texto en un archivo, pero no proporciona opciones de formato, como controlar el número de caracteres por línea o especificar el separador de línea.

  `PrintWriter`, por otro lado, proporciona funciones avanzadas de impresión, incluyendo opciones de formato y descarga automática de líneas. También proporciona una API más amigable para escribir en un archivo en comparación con `FileWriter`.

  Así es como puedes usar `FileWriter` y `PrintWriter` juntos en un programa:

  ```java
  import java.io.*;

  public class WriteToFile {
      public static void main(String[] args) {
          try {
              FileWriter fw = new FileWriter("output.txt");
              PrintWriter pw = new PrintWriter(fw);
              pw.println("This is a line written using PrintWriter");
              pw.println("Another line written using PrintWriter");
              pw.close();
              fw.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
  }
  ```

  En este ejemplo, se usa `FileWriter` para abrir un archivo llamado `output.txt` y `PrintWriter` para escribir líneas de texto en el archivo. El método `println` en `PrintWriter` agrega automáticamente un separador de línea después de cada línea de texto, haciendo más fácil escribir texto con formato en un archivo.

  Es importante tener en cuenta que debes cerrar tanto `FileWriter` como `PrintWriter` cuando termines de escribir en el archivo, como se muestra en el código anterior.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">No puedo enviar cambios a mi repositorio. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

  Si no puedes enviar cambios a tu repositorio, aquí hay algunos pasos que puedes seguir:

  1. Verifica tu conexión a internet: Asegúrate de que tu conexión a internet sea estable y funcione.
  2. Verifica la URL de tu repositorio: Asegúrate de estar usando la URL correcta de tu repositorio para enviar tus cambios.
  3. Revisa tus credenciales de Git: Asegúrate de que tus credenciales de Git estén actualizadas y correctas. Puedes revisar tus credenciales usando el siguiente comando:

  ```bash
  git config --list
  ```

  4. Actualiza tu repositorio local: Antes de enviar cambios, asegúrate de que tu repositorio local esté actualizado con el repositorio remoto. Puedes actualizar tu repositorio local usando el siguiente comando:

  ```bash
  git fetch origin
  ```

  5. Revisa posibles conflictos: Si hay conflictos entre tu repositorio local y el repositorio remoto, resuélvelos antes de enviar cambios.
  6. Envía cambios: Una vez que hayas resuelto los conflictos y actualizado tu repositorio local, puedes intentar enviar cambios nuevamente usando el siguiente comando:

  ```bash
  git push origin <branch_name>
  ```

</details>

