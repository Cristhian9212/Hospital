import java.util.Scanner

fun main() {
    val sistema = Hospital()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\n** Sistema de Gestión Hospitalaria **")
        println("1. Registrar paciente")
        println("2. Registrar médico")
        println("3. Registrar cita médica")
        println("4. Listar médicos por especialidad")
        println("5. Listar pacientes atendidos por médico")
        println("6. Salir")

        when (scanner.nextInt()) {
            1 -> {
                scanner.nextLine() // Consumir el salto de línea
                println("Ingresar datos del paciente:")
                println("DNI:")
                val dniPaciente = scanner.nextLine()
                println("Nombre:")
                val nombrePaciente = scanner.nextLine()
                println("Apellido:")
                val apellidoPaciente = scanner.nextLine()
                println("Fecha de nacimiento:")
                val fechaNacimientoPaciente = scanner.nextLine()
                println("Dirección:")
                val direccionPaciente = scanner.nextLine()
                println("Ciudad:")
                val ciudadPaciente = scanner.nextLine()
                println("Número de historia clínica:")cls
                val historiaPaciente = scanner.nextLine()
                println("Sexo:")
                val sexoPaciente = scanner.nextLine()
                println("Grupo sanguíneo (RH):")
                val rhPaciente = scanner.nextLine()
                println("Medicamentos a los que es alérgico (separados por comas):")
                val alergiasPaciente = scanner.nextLine().split(",").map { it.trim() }

                val paciente = Paciente(dniPaciente, nombrePaciente, apellidoPaciente, fechaNacimientoPaciente, direccionPaciente, ciudadPaciente, historiaPaciente, sexoPaciente, rhPaciente, alergiasPaciente)
                sistema.registrarPaciente(paciente)
                println("Paciente registrado con éxito.")
            }
            2 -> {
                scanner.nextLine() // Consumir el salto de línea
                println("Ingresar datos del médico:")
                println("DNI:")
                val dniMedico = scanner.nextLine()
                println("Nombre:")
                val nombreMedico = scanner.nextLine()
                println("Apellido:")
                val apellidoMedico = scanner.nextLine()
                println("Fecha de nacimiento:")
                val fechaNacimientoMedico = scanner.nextLine()
                println("Dirección:")
                val direccionMedico = scanner.nextLine()
                println("Ciudad:")
                val ciudadMedico = scanner.nextLine()
                println("Código de empleado:")
                val codigoMedico = scanner.nextLine()
                println("Número de horas extras:")
                val horasExtrasMedico = scanner.nextInt()
                scanner.nextLine() // Consumir el salto de línea
                println("Fecha de ingreso:")
                val fechaIngresoMedico = scanner.nextLine()
                println("Área:")
                val areaMedico = scanner.nextLine()
                println("Cargo:")
                val cargoMedico = scanner.nextLine()
                println("Salario mensual:")
                val salarioMedico = scanner.nextDouble()
                println("Porcentaje adicional por hora extra:")
                val horaExtraMedico = scanner.nextDouble()
                scanner.nextLine() // Consumir el salto de línea
                println("Especialidad:")
                val especialidadMedico = scanner.nextLine()
                println("Servicio:")
                val servicioMedico = scanner.nextLine()
                println("Número de consultorio:")
                val consultorioMedico = scanner.nextInt()
                scanner.nextLine() // Consumir el salto de línea

                val medico = DatoMedico(dniMedico, nombreMedico, apellidoMedico, fechaNacimientoMedico, direccionMedico, ciudadMedico, codigoMedico, horasExtrasMedico, fechaIngresoMedico, areaMedico, cargoMedico, salarioMedico, horaExtraMedico, especialidadMedico, servicioMedico, consultorioMedico)
                sistema.registrarEmpleado(medico)
                println("Médico registrado con éxito.")
            }
            3 -> {
                scanner.nextLine() // Consumir el salto de línea
                println("Ingresar datos de la cita médica:")
                println("DNI del paciente:")
                val dniPacienteCita = scanner.nextLine()
                println("Código del médico:")
                val codigoMedicoCita = scanner.nextLine()
                println("Fecha de la cita:")
                val fechaCita = scanner.nextLine()
                println("Hora de la cita:")
                val horaCita = scanner.nextLine()

                // Buscar paciente y médico para registrar la cita
                val pacienteCita = sistema.pacientes.find { it.dni == dniPacienteCita }
                val medicoCita = sistema.buscarMedicoPorCodigo(codigoMedicoCita)

                if (pacienteCita != null && medicoCita != null) {
                    val cita = CitaMedica(pacienteCita, medicoCita, fechaCita, horaCita)
                    sistema.registrarCita(cita)
                    println("Cita registrada con éxito.")
                } else {
                    println("No se pudo encontrar al paciente o médico para registrar la cita.")
                }
            }
            4 -> {
                scanner.nextLine() // Consumir el salto de línea
                println("Ingresar especialidad para listar médicos:")
                val especialidad = scanner.nextLine()
                val medicosPorEspecialidad = sistema.listarMedicosPorEspecialidad(especialidad)
                println("Médicos de la especialidad $especialidad:")
                medicosPorEspecialidad.forEach { println("${it.nombre} ${it.apellido}") }
            }
            5 -> {
                scanner.nextLine() // Consumir el salto de línea
                println("Ingresar código de médico para listar pacientes atendidos:")
                val codigoMedicoParaPacientes = scanner.nextLine()
                val pacientesAtendidos = sistema.listarPacientesAtendidosPorMedico(codigoMedicoParaPacientes)
                println("Pacientes atendidos por el médico con código $codigoMedicoParaPacientes:")
                pacientesAtendidos.forEach { println(it) }
            }
            6 -> {
                println("Saliendo del sistema...")
                break
            }
            else -> {
                println("Opción inválida. Por favor, elija una opción válida.")
            }
        }
    }
}
