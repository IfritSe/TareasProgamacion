/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica8;

import java.util.Random;

/**
 *
 * @author fundacion
 */
public class Practica8 {

    public static void main(String[] args) {
        String input = "Según un estudio de una universidad inglesa, "
                + "no importa el orden en el que las letras están escritas, "
                + "la única cosa importante es que la primera y última letra "
                + "estén escritas en la posición correcta. El resto pueden estar"
                + " totalmente mal y aún podrás leerlo sin problemas. Esto es "
                + "porque no leemos cada letra por sí misma. sino la palabra "
                + "como un todo. Personalmente me parece increíble.";
        String convertir = input, convertir2;
        Random aleatorio = new Random();
        boolean repetir = true;
        char[] palabra;
        int valor = -1, cantidadlista ,cantidadlistaverificar;
        String[] frase = convertir.split(" ");
        while (repetir){
            int unirvalores;
            String palabrafinal = "", unirpalabra;
            valor++;
            
            if (valor >= frase.length){
                break;
            }
            
            convertir2 = frase[valor];
            palabra =convertir2.toCharArray();
            cantidadlista = palabra.length;
            cantidadlistaverificar = palabra.length;
            
            if (palabra[cantidadlista-1] == ','){
                cantidadlista -= 1;
            }
            if (palabra[cantidadlista-1] == '.'){
                cantidadlista -= 1;
            }
            
            int cantidad = cantidadlista-2, rango = cantidadlista-1;
            if (cantidadlista == 1){
                cantidad += 1;
            }
            
            int [] numeros = new int[cantidad];
            for (int i=0; i<cantidad; i++){
                numeros[i]= 1+aleatorio.nextInt( (rango+0) - 1);
                for(int j=0; j<i; j++){
                    if (numeros[i]==numeros[j]){
                        i--;
                    }
                }
            }
            unirpalabra = String.valueOf(palabra[0]);
            palabrafinal = palabrafinal + unirpalabra;
            for (int k = 0; k<numeros.length; k++){
                unirvalores = numeros[k];
                unirpalabra = String.valueOf(palabra[unirvalores]);
                palabrafinal = palabrafinal + unirpalabra;
            }
            if (cantidadlistaverificar !=1){
                unirpalabra = String.valueOf(palabra[cantidadlista-1]);
                palabrafinal = palabrafinal + unirpalabra;
            }
            if (cantidadlista < cantidadlistaverificar){
                palabrafinal = palabrafinal + palabra[cantidadlistaverificar-1];
            }
            System.out.print(palabrafinal +" ");
        }
    }
}
