class Hospital {
    val pacientes = mutableListOf<Paciente>()
    val empleados = mutableListOf<DatoEmpleado>()
    val medicos = mutableListOf<DatoMedico>()
    val citas = mutableListOf<CitaMedica>()

    // Registrar un nuevo paciente
    fun registrarPaciente(paciente: Paciente) {
        pacientes.add(paciente)
    }

    // Registrar un nuevo empleado
    fun registrarEmpleado(empleado: DatoEmpleado) {
        empleados.add(empleado)
        if (empleado is DatoMedico) {
            medicos.add(empleado)
        }
    }

    // Registrar una nueva cita
    fun registrarCita(cita: CitaMedica) {
        citas.add(cita)
    }

    // Listar médicos por especialidad
    fun listarMedicosPorEspecialidad(especialidad: String): List<DatoMedico> {
        return medicos.filter { it.especialidad == especialidad }
    }

    // Listar pacientes atendidos por un médico determinado
    fun listarPacientesAtendidosPorMedico(codigoMedico: String): List<String> {
        return citas.filter { it.medico.CodigoEmpleado == codigoMedico }
            .map { "${it.paciente.nombre} ${it.paciente.apellido}" }
    }

    // Buscar paciente por DNI
    fun buscarPacientePorDNI(dni: String): Paciente? {
        return pacientes.find { it.dni == dni }
    }

    // Buscar médico por código de empleado
    fun buscarMedicoPorCodigo(codigo: String): DatoMedico? {
        return medicos.find { it.CodigoEmpleado == codigo }
    }
}