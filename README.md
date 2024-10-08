# Sistema de Gestión Hospitalaria

Este proyecto implementa un sistema de gestión hospitalaria en Kotlin que permite registrar y manejar información de pacientes, empleados, médicos y citas médicas. La aplicación utiliza clases y herencia para modelar las entidades y su relación con el hospital.

## Funcionalidades

1. **Registrar Pacientes**: Permite ingresar y almacenar los datos de un paciente, incluyendo su información personal, historia clínica, sexo, grupo sanguíneo y alergias.

2. **Registrar Médicos**: Permite ingresar y almacenar los datos de un médico, que incluye su información personal, código de empleado, horas extras, fecha de ingreso, especialidad, servicio y consultorio asignado.

3. **Registrar Citas Médicas**: Permite agendar una cita médica entre un paciente y un médico, ingresando la fecha y la hora de la cita.

4. **Listar Médicos por Especialidad**: Permite listar todos los médicos que pertenecen a una especialidad específica.

5. **Listar Pacientes Atendidos por un Médico**: Permite listar los nombres y apellidos de los pacientes que han sido atendidos por un médico específico, identificado por su código.

## Estructura de Clases

- `DatoPersona`: Clase base para todos los tipos de personas (pacientes, empleados, médicos), contiene atributos como DNI, nombre, apellido, fecha de nacimiento, dirección y ciudad.

- `Paciente`: Hereda de `DatoPersona`, añade atributos específicos como número de historia clínica, sexo, grupo sanguíneo y lista de medicamentos a los que es alérgico.

- `DatoEmpleado`: Hereda de `DatoPersona`, añade atributos específicos como código de empleado, número de horas extras, fecha de ingreso, área y cargo.

- `EmpleadoPlanilla`: Hereda de `DatoEmpleado`, añade atributos específicos para empleados contratados por planilla, como salario mensual y porcentaje adicional por horas extras.

- `DatoMedico`: Hereda de `EmpleadoPlanilla`, añade atributos específicos para los médicos, como especialidad, servicio y número de consultorio.

- `Cita`: Representa una cita médica, contiene referencias a un paciente y un médico, así como la fecha y la hora de la cita.

- `SistemaHospital`: Clase que gestiona la lista de pacientes, empleados y citas. Provee métodos para registrar y buscar médicos y pacientes, así como para listar citas y médicos por especialidad.

## Uso del Programa

1. **Compilación y Ejecución**

   - Asegúrate de tener instalado Kotlin en tu máquina.
   - Compila y ejecuta el programa utilizando un entorno de desarrollo integrado (IDE) compatible con Kotlin, como IntelliJ IDEA, o usando la línea de comandos:

     ```bash
     kotlinc nombreDelArchivo.kt -include-runtime -d SistemaHospital.jar
     java -jar SistemaHospital.jar
     ```

2. **Interacción con el Menú**

   - Al iniciar el programa, se mostrará un menú con varias opciones:
     ```
     ** Sistema de Gestión Hospitalaria **
     1. Registrar paciente
     2. Registrar médico
     3. Registrar cita médica
     4. Listar médicos por especialidad
     5. Listar pacientes atendidos por médico
     6. Salir
     ```

   - Selecciona la opción deseada ingresando el número correspondiente y sigue las instrucciones para ingresar los datos requeridos.

   - Utiliza la opción `6` para salir del programa.

3. **Registro de Datos**

   - Al seleccionar una opción para registrar datos (pacientes, médicos o citas), el sistema te pedirá ingresar información específica relacionada con esa entidad.
   
   - Los datos serán almacenados en las listas correspondientes dentro de la clase `SistemaHospital`.

4. **Listar Médicos por Especialidad**

   - Introduce la especialidad deseada para ver una lista de médicos que trabajan en esa área específica.

5. **Listar Pacientes Atendidos por un Médico**

   - Introduce el código del médico para ver los nombres y apellidos de los pacientes que han sido atendidos por ese médico.

## Requisitos del Sistema

- Kotlin 1.5 o superior
- Java JDK 8 o superior

## Notas

- Este proyecto está diseñado para ejecutarse en modo consola.
- La información se guarda en memoria y se pierde al finalizar la ejecución del programa.
- El sistema no incluye validación de datos avanzada (e.g., formatos de fecha, validación de DNI único, etc.), por lo que se recomienda ingresar datos en formatos válidos para evitar comportamientos inesperados.

## Futuras Mejoras

- Persistencia de datos utilizando una base de datos.
- Interfaz gráfica de usuario (GUI) para mejorar la interacción.
- Validación y manejo de errores más robusto.
- Implementación de características adicionales como edición y eliminación de registros.

## Autor

- Proyecto desarrollado por [Tu Nombre].

```

Este archivo README proporciona una descripción completa del sistema, la estructura del código y cómo interactuar con el programa. Puede ser utilizado como una guía para entender el proyecto y ejecutarlo de manera efectiva.