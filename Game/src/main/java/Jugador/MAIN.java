/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugador;

import java.util.Scanner;

/**
 *
 * @author fundacion
 */
public class MAIN {
    public static void main(String [] args){
        String Nombre = "Destroyer";
        int SaludTotal = 1000;
        int ManaTotal = 500;
        int SaludActual = 750;
        int ManaActual = 200;
        int pocionesVida = 0;
        int pocionesMana = 0;
        int pocionesTrampa = 0;
        String[] powerUp = new String[1];
        int [] powerUp2 = {0,0};
        Scanner interacciones = new Scanner(System.in);
        boolean menu = true, menu2 = true;
        while(menu){
            
            System.out.println("""
                               
                               \u00bfQue desea hacer?
                               1.Informacion Jugador
                               2.Inventario
                               3.Cerrar el programa""");
            int opciones = interacciones.nextInt();
            System.out.println(opciones);
            if (opciones == 1){
                Game Jugador = new Game(Nombre,SaludTotal,ManaTotal,SaludActual,ManaActual);
                Jugador.mostrarDatosJugador(SaludActual+powerUp2[0], ManaActual+powerUp2[1]); 
            }
            if (opciones == 2){
                PlayerInventory Inventario = new PlayerInventory(pocionesVida, pocionesMana, pocionesTrampa);
                OUTER:
                while (menu2) {
                    System.out.println("""
                                       \n0. Cerrar el inventario
                                       1. Agregar Item
                                       2. Mostrar inventario
                                       3. Usar objeto del inventario""");
                    opciones = interacciones.nextInt();
                    if (opciones == 0){
                        break;
                    }
                    else if (opciones ==1){
                        Inventario.agregarItem();
                    }
                    else if (opciones == 2){
                        Inventario.MostrarInventario();
                    }
                    else if (opciones ==3){
                        powerUp[0] = Inventario.UsarObjeto();
                        if (powerUp[0] == "HP Potion"){
                            powerUp2[0] = powerUp2[0]+100;
                        }
                        else if(powerUp[0] == "Mana Potion"){
                            powerUp2[1] = powerUp2[1]+50;
                        }
                        else if(powerUp[0] == "HP Potion?"){
                            powerUp2[0] = powerUp2[0]-100;
                        }
                    }
                    else{
                        System.out.println("DIgite una opción válida");
                    }
                }
            }
            if(opciones == 3){
                break;
            }
        }
    }
}