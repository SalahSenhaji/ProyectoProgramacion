package com.app.web;

import com.app.dao.DAOUser;
import com.app.models.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("um")
@ApplicationScoped
public class UserManager implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username, email, password, mensaje;
    private String usernameImp, emailImp, passwordImp, mensajeImp;
    private boolean logeado;
    private transient final DAOUser dao;
    private User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public UserManager() {
        dao = new DAOUser();
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }

    public String getUsernameImp() {
        return usernameImp;
    }

    public void setUsernameImp(String usernameImp) {
        this.usernameImp = usernameImp;
    }

    public String getEmailImp() {
        return emailImp;
    }

    public void setEmailImp(String emailImp) {
        this.emailImp = emailImp;
    }

    public String getPasswordImp() {
        return passwordImp;
    }

    public void setPasswordImp(String passwordImp) {
        this.passwordImp = passwordImp;
    }

    public String getMensajeImp() {
        return mensajeImp;
    }

    public void setMensajeImp(String mensajeImp) {
        this.mensajeImp = mensajeImp;
    }

    
    public String entrar() {
        if (this.email.isBlank() || this.password.isBlank()) {
            mensaje = "Debe introducir los datos";
            return "";
        }
        currentUser = dao.leer(email);
        if (currentUser == null) {
            mensaje = "No existe ningun usuario con ese email";
            return "";
        } else if (currentUser.getPassword().equals(this.password)) {
            mensaje = null;
            return "show";
        }
        mensaje = "La contraseña no es válida";
        return "";
    }

    public String reset() {
        this.username = "";
        this.password = "";
        this.email = "";
        this.mensaje = "";
        this.currentUser = null;

        return "index";
    }

    public String create() {
        dao.grabar(new User(username, email, password));
        mensaje = "Usuario creado con exito";
        return "";
    }

    public String eliminar() {
        dao.eliminar(email);
        mensaje = "Usuario eliminado con exito";
        return "";
    }

    public void leer() {
       User u  =  dao.leer(username);
       this.usernameImp=u.getUsername();
       this.emailImp=u.getEmail();
    }

}
