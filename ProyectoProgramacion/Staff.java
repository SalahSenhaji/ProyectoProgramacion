import java.util.ArrayList;

public abstract class Staff {
    String fechaIngreso;
    String estudios;
    String idiomas;
    TipoStaff tipoStaff;
    Departamento departamento;
    Persona persona;

    // Constructor
    public Staff(String fechaIngreso, String estudios, String idiomas, TipoStaff tipoStaff,
            Departamento departamento, Persona persona) {
        this.fechaIngreso = fechaIngreso;
        this.estudios = estudios;
        this.idiomas = idiomas;
        this.tipoStaff = tipoStaff;
        this.departamento = departamento;
        this.persona = persona;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public TipoStaff getTipoStaff() {
        return tipoStaff;
    }

    public void setTipoStaff(TipoStaff tipoStaff) {
        this.tipoStaff = tipoStaff;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    // Resto de métodos y atributos de la clase
    // ...
}