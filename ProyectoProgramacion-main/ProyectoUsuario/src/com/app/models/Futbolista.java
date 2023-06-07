/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.models;

/**
 *
 * @author manana
 */
public class Futbolista {
    public String nombre, apellidos, nacionalidad, posicion;
    public int edad, defensa, ataque, pase, ritmo, Equipo;
    
    
    
    public Futbolista(String nombre, String apellidos, int edad, String nacionalidad, String posicion,
            int defensa, int ataque, int pase, int ritmo, int idEquipo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.defensa = defensa;
        this.ataque = ataque;
        this.pase = pase;
        this.ritmo = ritmo;
        this.Equipo = idEquipo;
    }
    //constructor sin id de equipo
    public Futbolista(String nombre, String apellidos, int edad, String nacionalidad, String posicion,
            int defensa, int ataque, int pase, int ritmo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.defensa = defensa;
        this.ataque = ataque;
        this.pase = pase;
        this.ritmo = ritmo;
       
    }

    public int getIdEquipo() {
        return Equipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.Equipo = idEquipo;
    }
    public Futbolista(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getPase() {
        return pase;
    }

    public void setPase(int pase) {
        this.pase = pase;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nacionalidad=" + nacionalidad + ", posicion=" + posicion + ", edad=" + edad + ", defensa=" + defensa + ", ataque=" + ataque + ", pase=" + pase + ", ritmo=" + ritmo + '}';
    }
    
    
    
}
