/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.*;
import java.util.ArrayList;

/**
 *
 * @author cantilloisabella
 */
public abstract class Registro {
    protected LocalDateTime fecha;

    public Registro(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    
    public double latitud(){
        return 0;
    }
    public double longitud(){
        return 0;
    }
    
    
}
