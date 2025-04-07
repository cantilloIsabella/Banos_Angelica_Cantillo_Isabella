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
public class RegistroOperador extends Registro{
    private UsuarioOperador usuario;
    private Antena antena;

    
    
    public RegistroOperador( Antena antena, LocalDateTime fecha) {
        super(fecha);
        this.antena = antena;
                
    }
    
   public void addUsuario(UsuarioOperador usuario){
               this.usuario = usuario;   

   }
   @Override
    public double latitud(){
        return antena.getLatitud();
    }
    @Override
    public double longitud(){
        return antena.getLongitud();
    }
}
