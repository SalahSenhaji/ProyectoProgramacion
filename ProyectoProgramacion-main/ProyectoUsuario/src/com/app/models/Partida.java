/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.models;

/**
 *
 * @author manana
 */
class Partida {

    private int idPartida;
    private Usuario user1;
    private Equipo equipo1;
    private Usuario user2;
    private Equipo equipo2;
    private double resultadoUser1;
    private double resultadoUser2;
    int ganador;

    public Partida(int idPartida, Usuario user1, Equipo equipo1, Usuario user2, Equipo equipo2, double resultadoUser1, double resultadoUser2) {
        this.idPartida = idPartida;
        this.user1 = user1;
        this.equipo1 = equipo1;
        this.user2 = user2;
        this.equipo2 = equipo2;
        this.resultadoUser1 = resultadoUser1;
        this.resultadoUser2 = resultadoUser2;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public Usuario getUser1() {
        return user1;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Usuario getUser2() {
        return user2;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public double getResultadoUser1() {
        return resultadoUser1;
    }

    public double getResultadoUser2() {
        return resultadoUser2;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public void setUser1(Usuario user1) {
        this.user1 = user1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setUser2(Usuario user2) {
        this.user2 = user2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public void setResultadoUser1(double resultadoUser1) {
        this.resultadoUser1 = resultadoUser1;
    }

    public void setResultadoUser2(double resultadoUser2) {
        this.resultadoUser2 = resultadoUser2;
    }

    void calcularPartido() {
        if (this.resultadoUser1 < this.resultadoUser2) {
            ganador = 1;
        } else {
            ganador = 2;
        }
    }
}
