/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.models;

import java.util.ArrayList;

/**
 *
 * @author manana
 */
public class GestoraEquipo {

    public GestoraEquipo() {
    }

    private static int idEquipo;
    private Equipo equipo = new Equipo();

   
//Funcion que crea un equipo pasandole un usuario y el nombre del equipo.
    public Equipo crearEquipo(Usuario user, String nombre) {
        idEquipo++;
        Equipo team = new Equipo(idEquipo, user, nombre);
        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        this.equipo = team;
        System.out.println("El equipo '" + nombre + "' ha sido creado correctamente ");
        return team;
    }
//Funcion que devuelve el equipo
    public Equipo getEquipoGestor() {
        return this.equipo;
    }
//Funcion que añade un jugador a un equipo
    public boolean addJugadorEquipo(Futbolista fu) {
        equipo.addFutbolista(fu);
        return true;
    }
    public void deleteJugador(Futbolista fu){
         this.equipo.deleteFutbolista(fu.getNombre());
        
    }
    

    /*public void guardarEquipo() {

    }*/

    public String leerEquipos(Equipo e) {
        return e.toString();
    }

}
