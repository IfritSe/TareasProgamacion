/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Jugador;

/**
 *
 * @author fundacion
 */
public class Game extends PlayerInfo {
    
    private int saludActual;
    private int manaActual;
    
    
    public Game(String nombreJugador,int puntosSaludTotal, int puntosManaTotal, int saludActual, int manaActual){
        super(nombreJugador, puntosSaludTotal, puntosManaTotal);
        this.saludActual = saludActual;
        this.manaActual = manaActual;
    }

    public int getSaludActual() {
        return saludActual;
    }

    public int getManaActual() {
        return manaActual;
    }
    
    
    
    
    public void mostrarDatosJugador(int SaludActual, int ManaActual){
        if (SaludActual <= 0){
            System.out.println("El jugador murio");
        }
        else if (SaludActual > 1000){
            SaludActual = 1000;
            System.out.println("Nombre Jugador: "+getNombreJugador()+
                    "\nSalud Actual del Personaje: "+SaludActual+"/"+getPuntosSaludTotal()+
                    "\nMana Actual del Personaje: "+ManaActual+"/"+getPuntosManaTotal());
        }
        else if (ManaActual > 500){
            ManaActual = 500;
            System.out.println("Nombre Jugador: "+getNombreJugador()+
                    "\nSalud Actual del Personaje: "+SaludActual+"/"+getPuntosSaludTotal()+
                    "\nMana Actual del Personaje: "+ManaActual+"/"+getPuntosManaTotal());
        }
        else {
        System.out.println("Nombre Jugador: "+getNombreJugador()+
                "\nSalud Actual del Personaje: "+SaludActual+"/"+getPuntosSaludTotal()+
                "\nMana Actual del Personaje: "+ManaActual+"/"+getPuntosManaTotal());           
        }
    }
}
