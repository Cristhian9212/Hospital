open class DatoEmpleado(
    dni: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: String,
    direccion: String,
    ciudad: String,
    val CodigoEmpleado: String,
    val HorasExtras: Int,
    val Fingreso: String,
    val area: String,
    val cargo: String
) :DatoPaciente(dni, nombre, apellido, fechaNacimiento, direccion, ciudad)