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
public class UsuarioOperador extends Usuario{
     private ArrayList<RegistroOperador> historial;

    public UsuarioOperador(String celular, boolean covid) {
        super(celular, covid);
        historial = new ArrayList<>();
    }
    
    @Override
    public void addRegistro(RegistroOperador registro){
        this.historial.add(registro);
        registro.addUsuario(this);
    }
    
    @Override
    public ArrayList<RegistroOperador> getRegistro(UsuarioOperador usuario){
        System.out.println(historial);
        return historial;
    }


}
