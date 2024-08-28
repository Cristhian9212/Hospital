class Paciente(
    dni: String,
    nombre: String,
    apellido: String,
    fechaNacimiento: String,
    direccion: String,
    ciudad: String,
    val historia: String,
    val sexo: String,
    val RH: String,
    val MedAlergias: List<String>
): DatoPaciente(dni, nombre, apellido, fechaNacimiento, direccion, ciudad)
{
}