/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecttest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;





/**
 *
 * @author fundacion
 */
public class ProjectTest {
    
    public static void main(String args[]){
    // Metemos en una lista los números del 1 al 40.
    List<Integer> numbers = new ArrayList<>(40);
    for (int i=1;i<41;i++){
       numbers.add(i);
    }

    // Instanciamos la clase Random
    Random random = new Random();

    // Mientras queden cartas en el mazo (en la lista de numbers)
    while (numbers.size()>1){
       // Elegimos un índice al azar, entre 0 y el número de cartas que quedan por sacar
       int randomIndex = random.nextInt(numbers.size());

       // Damos la carta al jugador (sacamos el número por pantalla)
       System.out.println("Not Repeated Random Number "+numbers.get(randomIndex));

       // Y eliminamos la carta del mazo (la borramos de la lista)
       numbers.remove(randomIndex);
    }
    }
}
  


    
