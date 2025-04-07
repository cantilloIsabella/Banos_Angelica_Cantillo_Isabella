/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author cantilloisabella
 */
public abstract class Usuario {
    protected String celular;
    protected boolean covid;

    public Usuario(String celular, boolean covid) {
        this.celular = celular;
        this.covid = covid;
    }
    
    public void addRegistro(RegistroOperador registro){
    }
    
     public void addRegistro(RegistroAplicacion registro){
    }
     
     public ArrayList<RegistroOperador> getRegistro(UsuarioOperador usuario){
         return null;
     }
     
     public ArrayList<RegistroOperador> getRegistro(Usuario usuario){
         
         return null;
     }
     
     public ArrayList<RegistroAplicacion> getRegistro(UsuarioAplicacion usuario){
         return null;
     }
     
    
}
