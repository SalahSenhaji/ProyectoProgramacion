class Persona {
    private String nombre;
    private int edad;
    private int cumpleanos;
    private Gender genero;
    private String direccion;
    private long telefono;

    public Persona() {
    }

    public Persona(String nombre, int edad, int cumpleanos, Gender genero, String direccion, long telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.cumpleanos = cumpleanos;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(int cumpleanos) {
        this.cumpleanos = cumpleanos;
    }

    public Gender getGenero() {
        return genero;
    }

    public void setGenero(Gender genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
