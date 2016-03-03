/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena;

/**
 *
 * @author Sammy Cabrera
 */
public class Cliente extends Persona{
    
    /**
     * Email del cliente
     */
    private String email;
    
    /**
     * Telefono
     */
    private String telefono;

    public Cliente() {
    }

    public Cliente(String email, String telefono) {
        this.email = email;
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
}
