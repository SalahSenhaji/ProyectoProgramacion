package com.app.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 * @author fcoja
 */
public class DAOUsuario extends DAO<Usuario> {

    Connection myCon;

    public DAOUsuario() {

    }

    @Override
    public Usuario grabar(Usuario elemento) {
        myCon = getConecction();
        System.out.println("No hubo error en" + myCon);
        String sql = "INSERT INTO Usuario(Email, Nombre, Password) VALUES(?,?,?)";
        PreparedStatement pst;
        try {
            pst = myCon.prepareStatement(sql);
            pst.setString(1, elemento.getEmail());
            pst.setString(2, elemento.getNombre());
            pst.setString(3, elemento.getPassword());
            pst.executeUpdate();

            myCon.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return elemento;
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario modificar(Usuario elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Usuario> leerTodos() {
        Usuario u = null;

        try {
            ArrayList<Usuario> listaUsuario = new ArrayList<>();
            myCon = getConecction();
            Statement st = myCon.createStatement();
            String sql = "SELECT * FROM Usuario";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                u = new Usuario();
                u.setEmail(rs.getString("Email"));
                u.setNombre(rs.getString("Nombre"));
                u.setPassword(rs.getString("Password"));
                listaUsuario.add(u);
                return listaUsuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public Usuario leer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean eliminar(String email) {

        for (Usuario u : leerTodos()) {

            if (u.getEmail().equals(email)) {
                myCon = getConecction();
                String sql = "DELETE FROM Usuario WHERE email = ? ";
                PreparedStatement pst; 
                try {
                    pst = myCon.prepareStatement(sql);
                    pst.setString(1, email);
                    pst.executeUpdate();
                    myCon.close();
                    return true;
                } catch (SQLException ex) {
                    Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(Usuario elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
