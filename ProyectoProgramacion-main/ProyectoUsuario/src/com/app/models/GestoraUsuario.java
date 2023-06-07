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
public class GestoraUsuario {

    // TODO hacer el CRUD del usuario
    public Set<Usuario> users = new HashSet<>();

    public Usuario createUser(String name, String email, String password) {
        if (findByName(name) == null) {
            Usuario u = new Usuario(email, name, password);
            users.add(u);
            System.out.println("Usuario metido a la base de datos");
            return u;
        }
        System.out.println("Este usuario ya existe");
        return null;
    }

    public void readAll() {
        for (Usuario user : users) {
            System.out.println(user);
        }
    }

    public Usuario findByName(String name) {
        for (Usuario user : users) {
            if (user.getNombre().equals(name)) {
                System.out.println(user);
                return user;
            }
        }
        return null;
    }
    

}
