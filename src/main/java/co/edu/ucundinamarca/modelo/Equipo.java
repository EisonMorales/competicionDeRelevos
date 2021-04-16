/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.modelo;

/**
 * Clase encargada ...
 * 
 * @author Eison Andrei Morales Pardo
 * @author Juan Camilo Páez Beltran 
 * @since 1.0
 * @version 1.0.0
 */
public class Equipo extends Thread {
    
private String nombreEquipo;
   
public Equipo(){


}

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;

    }
    
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }


}
