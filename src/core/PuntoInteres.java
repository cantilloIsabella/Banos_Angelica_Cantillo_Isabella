/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.utils.DistanceUtils;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author cantilloisabella
 */
public class PuntoInteres {

    private String nombre;
    private String tipo;
    private double latitud;
    private double longitud;
    private double rango;
    private ArrayList<LocalDateTime> fechas;
    private ArrayList<ArrayList<Usuario>> usuarios;

    public PuntoInteres(String nombre, String tipo, double latitud, double longitud, double rango) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.rango = rango;
        this.fechas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void updateUsuariosCercanos(ArrayList<Usuario> usuarioP, LocalDateTime date) {
        LocalDateTime dateSig;
        DistanceUtils utils = new DistanceUtils();
        if (date.getHour() < 24) {
            dateSig = date.plusHours(1);
        } else {
            dateSig = date.plusDays(1);
            dateSig.minusHours(23);
        }
        
        for (Usuario usuario : usuarioP) {
            //for (Registro registro : usuario.getRegistro(usuario)) {
              //  if (registro.getFecha().getHour()< dateSig.getHour() && registro.getFecha().getHour()> date.getHour() && registro.getFecha().getDayOfMonth()<= dateSig.getDayOfMonth() && registro.getFecha().getDayOfMonth()== date.getDayOfMonth()&& registro.getFecha().getMonth()== date.getMonth()) {
                 //   if(utils.haversineDistance(this.latitud, this.longitud, registro.latitud(), registro.longitud()) <= 100){
                  //      this.usuarios.get(0).add(usuario);
                 //   }
               // }
           // }
        }

       
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }
    
    
}
