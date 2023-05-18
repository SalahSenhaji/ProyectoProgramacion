package proyectojava;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manana
 */
public class Estadisticas {
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;

    public Estadisticas() {
        partidasJugadas = 0;
        partidasGanadas = 0;
        partidasPerdidas = 0;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public void addPartidasJugadas() {
        this.partidasJugadas++;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void addPartidasGanadas() {
        this.partidasGanadas++;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void addPartidasPerdidas() {
        this.partidasPerdidas++;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
}