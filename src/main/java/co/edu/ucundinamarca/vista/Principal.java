/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.vista;

import co.edu.ucundinamarca.modelo.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase encargada de iniciar los hilos 
 * 
 * @author Eison Andrei Morales Pardo
 * @author Juan Camilo Páez Beltran 
 * @since 1.0
 * @version 1.0.0
 */
public class Principal {
 /**
 * Metodo sobrecargado  que se encarga de almacenar la información de los jugadores
 */
    public Principal() {
        
                Object a = new Object();
                Object b = new Object();
                Object c = new Object();

                Jugador jugador1 = new Jugador("Juan", (byte)1, (byte)0, "Cariocas", a);
                Jugador jugador2 = new Jugador("Cesar",(byte)2,(byte)30,"Cariocas", a);
                Jugador jugador3 = new Jugador("Diego",(byte)3,(byte)60,"Cariocas", a);
                Jugador jugador4 = new Jugador("Eison", (byte)1,(byte)0,"Charruas", b);
                Jugador jugador5 = new Jugador("Andrei",(byte)2,(byte)30,"Charruas", b);
                Jugador jugador6 = new Jugador("Camilo",(byte)3,(byte)60,"Charruas", b);
                Jugador jugador7 = new Jugador("Anderson",(byte)1,(byte)0,"Guaranis", c);
                Jugador jugador8 = new Jugador("Augusto",(byte)2,(byte)30,"Guaranis", c);
                Jugador jugador9 = new Jugador("Pedro",(byte)3,(byte)60,"Guaranis", c);

                List<Jugador> corredores = new ArrayList<>();
                
                 corredores.add(jugador1);
                 corredores.add(jugador2);
                 corredores.add(jugador3);
                 corredores.add(jugador4);
                 corredores.add(jugador5);
                 corredores.add(jugador6);  
                 corredores.add(jugador7);
                 corredores.add(jugador8);
                 corredores.add(jugador9);
                
                for (Jugador inicializar : corredores) {
                    inicializar.start();
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                synchronized(a){
                     a.notify();
                 }
                synchronized(b){
                     b.notify();
                 }
                synchronized(c){
                     c.notify();
                 }
        
    }
    
    public static void main(String[] args) {
        new Principal();
    }
}
   