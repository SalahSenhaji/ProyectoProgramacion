public class Paciente extends Persona {
    String idPaciente;
    String nombre;
    String fechaIngreso;
    String enfermedad;
    String receta;

    // Constructor vacío
    public Paciente() {
    }

    // Constructor con argumentos
    public Paciente(String idPaciente, String nombre, String fechaIngreso, String enfermedad, String receta, int edad,
            int cumpleaños, Gender genero, String direccion, long telefono) {
        super(nombre, edad, cumpleaños, genero, direccion, telefono);
        this.receta = receta;
        this.enfermedad = enfermedad;
        this.fechaIngreso = fechaIngreso;
        this.idPaciente = idPaciente;

    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

}
