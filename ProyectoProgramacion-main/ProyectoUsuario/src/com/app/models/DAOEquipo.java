/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.models;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fcoja
 */
public class DAOEquipo extends DAO<Equipo> {

    Connection myCon;

    public DAOEquipo() {

        try {
            myCon = getConecction();

            System.out.println("No hubo error " + myCon);

            myCon.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión");
        }

    }

    @Override
    public Equipo grabar(Equipo elemento) {

        myCon = getConecction();
        System.out.println("No hubo error " + myCon);
        String sql = "INSERT INTO Equipo VALUES (?,?,?)";
        PreparedStatement pst;
        try {
            pst = myCon.prepareStatement(sql);
            pst.setInt(1, elemento.getIdEquipo());
            pst.setString(2, elemento.getUser().getEmail());
            pst.setString(3, elemento.getNombreEquipo());

            pst.executeUpdate();
            //cerramos la conexion con la base de datos
            myCon.close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        //devolvemos el equipo que se ha creado
        return elemento;
    }

    @Override
    public boolean eliminar(Equipo eq) {
        
         Connection myCon = null;
    PreparedStatement pst = null;

    try {
        myCon = getConecction();
        System.out.println("No hubo error " + myCon);

        String sql = "DELETE FROM Equipo WHERE idEquipo = ?";
        pst = myCon.prepareStatement(sql);
        pst.setInt(1, eq.getIdEquipo());
        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Equipo eliminado correctamente.");
            return true;
        } else {
            System.out.println("No se encontró ningún Equipo con ese id.");
            return false;
        }
    } catch (SQLException ex) {
        Logger.getLogger(DAOEquipo.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    } finally {
        // Cerrar la conexión y el PreparedStatement en el bloque finally
        try {
            if (pst != null) {
                pst.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
        
    }

    @Override
    public Equipo modificar(Equipo elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Equipo> leerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Equipo leer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
