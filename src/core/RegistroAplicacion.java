/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDateTime;

/**
 *
 * @author cantilloisabella
 */
public class RegistroAplicacion extends Registro{
    private double latitud;
    private double longitud;
    private UsuarioAplicacion usuario;

    public RegistroAplicacion(double latitud, double longitud, LocalDateTime fecha) {
        super(fecha);
    }
    
     public void addUsuario(UsuarioAplicacion usuario){
               this.usuario = usuario;   

   }

   @Override
    public double latitud(){
        return this.latitud;
    }
    @Override
    public double longitud(){
        return this.longitud;
    }
     
     
}
