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
class Equipo {
    
     private int idEquipo;
     private Usuario user;
     private String nombreEquipo;
     private ArrayList<Futbolista> futbolistas = new ArrayList<>();

    public Equipo(int idEquipo, Usuario user, String nombreEquipo) {
        this.idEquipo = idEquipo;
        this.user = user;
        this.nombreEquipo = nombreEquipo;
    }
    public Equipo(){
        
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public Usuario getUser() {
        return user;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public ArrayList<Futbolista> getFutbolistas() {
        return futbolistas;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setFutbolistas(ArrayList<Futbolista> futbolistas) {
        this.futbolistas = futbolistas;
    }  
    public void addFutbolista(Futbolista fu){
        this.futbolistas.add(fu);
        System.out.println("El jugador "+fu.nombre + " ha sido fichado correctamente");
    }
    
    public void deleteFutbolista(String nombre) {
    for (int i = 0; i < this.futbolistas.size(); i++) {
        Futbolista futbolista = this.futbolistas.get(i);
        if (futbolista.getNombre().equals(nombre)) {
            this.futbolistas.remove(i);
            System.out.println("El futbolista " + nombre + " ha sido eliminado.");
            return; // Termina el método una vez que se elimina el futbolista
        }
    }
    System.out.println("No se encontró ningún futbolista con el nombre " + nombre);
}


    @Override
    public String toString() {
        return "Equipo{" + "idEquipo=" + idEquipo + ", user=" + user + ", nombreEquipo=" + nombreEquipo + ", futbolistas=" + futbolistas + '}';
    }
     
}
