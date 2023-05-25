/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fcoja
 */
public class DAOFutbolista  extends DAO <Futbolista>{
    
    Connection myCon;

    public DAOFutbolista() {   
 
            
    }

    @Override
    public Futbolista grabar(Futbolista futbolista) {
        
        try {
            myCon = getConecction();            
            System.out.println("No hubo error " + myCon);
            String sql = "INSERT INTO Futbolista VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=  myCon.prepareStatement(sql);
            pst.setString(1, futbolista.getNombre());
            pst.setString(2, futbolista.getApellidos());
            pst.setInt(3, futbolista.getEdad());
            pst.setString(4, futbolista.getNacionalidad());
            pst.setString(5, futbolista.getPosicion());
            pst.setInt(6, futbolista.getDefensa());
            pst.setInt(7, futbolista.getAtaque());
            pst.setInt(8, futbolista.getPase());
            pst.setInt(9, futbolista.getRitmo());
            pst.executeUpdate();
            myCon.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOFutbolista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return futbolista;
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Futbolista modificar(Futbolista elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Futbolista> leerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
