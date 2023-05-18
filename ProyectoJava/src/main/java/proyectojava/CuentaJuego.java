package proyectojava;

import java.util.ArrayList;
import java.util.List;

public class CuentaJuego {
    private String nombre;
    private List<Jugador> plantillaJugadores;
    private int nivelProgreso;
    private Estadisticas estadisticas;

    public CuentaJuego(String nombre) {
        this.nombre = nombre;
        this.plantillaJugadores = new ArrayList<>();
        this.nivelProgreso = 0;
        this.estadisticas = new Estadisticas();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getPlantillaJugadores() {
        return plantillaJugadores;
    }

    public void agregarJugador(Jugador jugador) {
        this.plantillaJugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        this.plantillaJugadores.remove(jugador);
    }

    public int getNivelProgreso() {
        return nivelProgreso;
    }

    public void setNivelProgreso(int nivelProgreso) {
        this.nivelProgreso = nivelProgreso;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }
}
