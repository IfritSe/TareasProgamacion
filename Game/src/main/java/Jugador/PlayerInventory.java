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
public class PlayerInventory{
    Scanner accionInventario = new Scanner(System.in);
    String[] inventario = new String[16];
    boolean revisarInventario =true;
    String recuperaVida = "HP Potion";
    String recuperaMana = "Mana Potion";
    String perderVida = "HP Potion?";
    String itemActual;
    int contador;

    public PlayerInventory(int pocionesVida, int pocionesMana, int pocionesTrampa) {
        //while(revisarInventario){
        int cantidadItem1 = pocionesVida, cantidadItem2 = pocionesMana+pocionesVida, cantidadItem3 = pocionesTrampa+pocionesVida+pocionesMana;
        for(int i= 0; i<cantidadItem1; i++){
                if (( " ".equals(inventario[i])) || (inventario[i] == null)){
                    inventario[i] = recuperaVida;
                }
            }
        for(int j = 0; j<cantidadItem2;j++){
                if (( " ".equals(inventario[j])) || (inventario[j] == null)){
                    inventario[j] = recuperaMana;
                }           
        }
        for(int n = 0; n<cantidadItem3; n++){
                if (( " ".equals(inventario[n])) || (inventario[n] == null)){
                    inventario[n] = perderVida;
                }
            }
        //}
    }
    
    public String UsarObjeto(){
        System.out.println("Digite la ubicacion del objeto que desea usar: ");
        int usarItem = accionInventario.nextInt();
        usarItem -=1;
        if((" ".equals(inventario[usarItem])) || (inventario[usarItem] == null)){
            System.out.println("\nEl espacio del inventario esta vacío");
        }
        else{
            System.out.println("\nUsaste el item: "+inventario[usarItem]);
            if ("HP Potion".equals(inventario[usarItem])){
                itemActual = inventario[usarItem];
                inventario[usarItem] = " ";
                return itemActual;
            }
            else if ("Mana Potion".equals(inventario[usarItem])){
                itemActual = inventario[usarItem];
                inventario[usarItem] = " ";
                return itemActual;
            }
            else if ("HP Potion?".equals(inventario[usarItem])){
                itemActual = inventario[usarItem];
                inventario[usarItem] = " ";
                return itemActual;
            }
        }
        return null;
    }
    
    public void agregarItem(){
        System.out.println("""
                           \n\u00bfQue item desea agregar?
                           1. HP Potion
                           2. Mana Potion
                           3. HP Potion?""");
        int agregarItem = accionInventario.nextInt();
        System.out.println("¿Cuantos items de ese tipo desea agregar?");
        int cantidadItem = accionInventario.nextInt();
        contador = 0;
        for(int i= 0; i<inventario.length; i++){
            if(cantidadItem == contador){
                break;
            }
            if(i == inventario.length - 1 ){
                if (inventario[i] != " "){
                    System.out.println("¡El inventario esta lleno, utilice algún objeto!");
                    break;
                }
            }
            switch (agregarItem) {
                case 1 -> {
                    if (( " ".equals(inventario[i])) || (inventario[i] == null)){
                        inventario[i] = recuperaVida;
                        contador++;
                    }
                }
                case 2 -> {
                    if((" ".equals(inventario[i])) || (inventario[i] == null)){
                        inventario[i] = recuperaMana;
                        contador++;
                    }
                }
                case 3 -> {
                    if((" ".equals(inventario[i])) || (inventario[i] == null)){
                        inventario[i] = perderVida;
                        contador++;
                    }
                }
                default -> {
                        
                }
            }
        }  
    }

    public String getItemActual() {
        return itemActual;
    }
    
    
    public void MostrarInventario(){
        for(int l = 0; l < inventario.length; l++){
            if ((l%4 == 0)&& (l > 0)){
                System.out.println("|");
            }
            if (inventario[l] == null){
                inventario[l] = " ";
                System.out.print("|"+inventario[l]);
            }
            else{
                System.out.print("|"+inventario[l]);
            }
        }
        System.out.println("|");
    }
    
}
