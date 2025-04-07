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
public class UsuarioAplicacion extends Usuario {

    private String nombre;
    private String cedula;
    private String direccion;
    private ArrayList<RegistroAplicacion> historial;

    public UsuarioAplicacion(String cedula, boolean covid, String nombre, String celular, String direccion) {
        super(celular, covid);
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.historial = new ArrayList<>();
    }

    @Override
    public void addRegistro(RegistroAplicacion registro){
        this.historial.add(registro);
        registro.addUsuario(this);
    }
    
    @Override
     public ArrayList<RegistroAplicacion> getRegistro(UsuarioAplicacion usuario){
         
         return historial;
     }
}
