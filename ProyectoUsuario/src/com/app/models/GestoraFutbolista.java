    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.models;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author manana
 */
public class GestoraFutbolista {
    
    public Set<Futbolista> jugadores = new HashSet<>();
    
    public Futbolista crearFutbolista(String nombre, String apellidos, int edad, String nacionalidad, String posicion,
            int defensa, int ataque, int pase, int ritmo){
        if(findByName(apellidos) == null){
            Futbolista f = new Futbolista(nombre, apellidos, edad, nacionalidad, posicion, defensa, ataque, pase, ritmo);
            jugadores.add(f);
            System.out.println("El jugador ha sido creado ");
            return f;
        }
        System.out.println("Este jugador ya existe");
        return null;
    }
    
    
    private Futbolista findByName(String apellidos) {
        for (Futbolista jugador : jugadores) {
            if (jugador.getNombre().equals(apellidos)) {
                System.out.println(jugador);
                return jugador;
            }
        }
        return null;
    }
    
    
    
    
}
