/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author cantilloisabella
 */
public class CovidTrack {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Registro> registros;
    private ArrayList<Antena> antenas;
    private ArrayList<PuntoInteres> puntosInteres;

    public CovidTrack() {
        this.usuarios = new ArrayList<>();
        this.registros = new ArrayList<>();
        this.antenas = new ArrayList<>();
        this.puntosInteres = new ArrayList<>();
    }

    public void addAntena(Antena antena) {
        this.antenas.add(antena);
    }

    public void addPuntoInteres(String nombre, String tipo, double latitud, double longitud, double rango) {
        this.puntosInteres.add(new PuntoInteres(nombre, tipo, latitud, longitud, rango));
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public Usuario getUsuario(int index) {
        return this.usuarios.get(index);
    }
    public Antena getAntena(int index) {
        return this.antenas.get(index);
    }
    

    
    public void addRegistro(Usuario usuario, Antena antena, LocalDateTime date){
        usuario.addRegistro(new RegistroOperador(antena, date));
    }
    
    public void addRegistro(Usuario usuario, double latitud, double longitud, LocalDateTime date){
        usuario.addRegistro(new RegistroAplicacion(latitud, longitud, date));
    }
    
    public PuntoInteres getPuntoInteres(int index){
        return puntosInteres.get(index);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void showResumenPuntosIntesesPorMes() {
        for(PuntoInteres puntoInteres : puntosInteres){
            System.out.println("Punto Interes 0"+(puntosInteres.indexOf(puntoInteres)+1));
            System.out.println("- Nombre ");
        }
    }

   
    
    
}
