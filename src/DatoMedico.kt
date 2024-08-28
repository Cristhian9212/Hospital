class DatoMedico(
    dni: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: String,
    direccion: String,
    ciudad: String,
    CodigoEmpleado: String,
    HorasExtras: Int,
    Fingreso: String,
    area: String,
    cargo: String,
    SalarioMensual: Double,
    HoraExtra: Double,
    val especialidad: String,
    val servicio: String,
    val consultorio: Int
) : EmpleadoPlanilla(dni, nombre, apellido, fechaNacimiento, direccion, ciudad,
    CodigoEmpleado, HorasExtras, Fingreso, area, cargo, SalarioMensual, HoraExtra) {
}