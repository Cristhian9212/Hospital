open class EmpleadoPlanilla (
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
    val SalarioMensual: Double,
    val HoraExtra: Double,
) :DatoEmpleado (dni, nombre, apellido, fechaNacimiento, direccion, ciudad,
    CodigoEmpleado, HorasExtras, Fingreso, area, cargo)
{
}

