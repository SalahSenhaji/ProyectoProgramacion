/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.app.launch;

import com.app.models.*;


public class ProyectoUsuario {
    
    public static void main(String[] args) {
        
        DAOFutbolista daoFutbolista= new DAOFutbolista();
        
        Futbolista f = new Futbolista("Dios Mesianico  Lionel Andrés", "Messi", 35, "Argentina", "delantero", 37, 86, 83, 89);
       
        
        System.out.println(daoFutbolista.grabar(f).toString());
        
        
        
    }

    /*public static void main(String[] args) {
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
    }*/

}
