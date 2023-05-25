/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.app.launch;

import com.app.models.GestoraEquipo;
import com.app.models.GestoraFutbolista;
import com.app.models.GestoraUsuario;
import com.app.models.Futbolista;

import com.app.models.Usuario;

/**
 *
 * @author Profesormanana
 */
public class ProyectoUsuario {

    public static void main(String[] args) {
        GestoraUsuario gu = new GestoraUsuario();
        int i;
        gu.createUser("Ramon", "ramon_perez@gmail.com", "1234");
        gu.createUser("Luis", "luis546@gmail.com", "1234");
        gu.createUser("Sofia", "sofiatelalia@hotmail.com", "1234");
        gu.createUser("Sofia", "s12441@hotmail.com", "1234");
       
        gu.findByName("Luis");
        
        gu.readAll();
         
        Usuario user = new Usuario();

        GestoraEquipo ge = new GestoraEquipo();
        ge.crearEquipo(user, "los mataos");
        GestoraFutbolista gf = new GestoraFutbolista();
        Futbolista fu;
        Futbolista su;
        Futbolista du;

        fu = gf.crearFutbolista("Cristiano", "Ronaldo", 37, "Portugal", "delantero", 37, 86, 83, 89);
        su = gf.crearFutbolista("messi", "leo", 35, "Argentina", "delantero", 37, 86, 83, 89);
        du = gf.crearFutbolista("neymar", "jr", 32, "brasil", "delantero", 37, 86, 83, 89);

        ge.addJugadorEquipo(fu);
        ge.addJugadorEquipo(su);
        ge.addJugadorEquipo(du);

        ge.deleteJugador(fu);
    }

}
