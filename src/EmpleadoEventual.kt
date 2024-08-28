class EmpleadoEventual (
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
    val HonorioXHora: Int,
    val HorasTotales: Int,
    val FinContrato: String
) :DatoEmpleado (dni, nombre, apellido, fechaNacimiento, direccion, ciudad,
    CodigoEmpleado, HorasExtras, Fingreso, area, cargo)
