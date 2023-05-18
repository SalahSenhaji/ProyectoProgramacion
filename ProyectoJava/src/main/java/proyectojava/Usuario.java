package proyectojava;

import java.util.ArrayList;

/**
 *
 * @author Salah
 */
public class Usuario {
    private String  email;
    private String nombre;
    private String password;
    private ArrayList<Equipo> equipos = new ArrayList<>();

    public Usuario(String email, String nombre, String password) {
        
        this.email = email;
        this.nombre = nombre;
        this.password = password;
    }
    public Usuario(){
        
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
   
}
