/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugador;

/**
 *
 * @author fundacion
 */
public class PlayerInfo {
    private String nombreJugador;
    private int puntosSaludTotal;
    private int puntosManaTotal;

    public PlayerInfo(String nombreJugador, int puntosSaludTotal, int puntosManaTotal) {
        this.nombreJugador = nombreJugador;
        this.puntosSaludTotal = puntosSaludTotal;
        this.puntosManaTotal = puntosManaTotal;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getPuntosSaludTotal() {
        return puntosSaludTotal;
    }

    public int getPuntosManaTotal() {
        return puntosManaTotal;
    }

    
    
}

