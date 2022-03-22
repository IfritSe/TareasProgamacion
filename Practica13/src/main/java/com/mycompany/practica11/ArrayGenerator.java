/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica11;

import com.sun.jdi.IntegerValue;


/**
 *
 * @author fundacion
 */
public class ArrayGenerator {
    String valor2;
    int [] numeros = new int[100];
    int[] fibonacci = new int[100];
    public ArrayGenerator(){
        int valor = 0, verificar = 0;
        int numero;
        boolean repetir = true;
        do{
            if(valor <= 0){
                fibonacci[valor] = 0;
            }
            else if (valor == 1){
                fibonacci[valor] =1;
            }
            else{
                fibonacci[valor] = fibonacci[valor-2] + fibonacci[valor-1];
            }
            numero = (int)(Math.random()*140 + 1);
            while(repetir){
                if(fibonacci[verificar] == numero){
                    numero = (int)(Math.random()*140 +1);
                }
                else{
                    numeros[valor] = numero;
                    break;
                }
            }
            valor++;
        }while(valor < numeros.length);
        
        
    }

    public String toString(){
        boolean repetir = true;
        int valor = 0;
        String resultado = "";
        while(repetir){
            if (valor == 100){
                break;
            }
            resultado = resultado + String.valueOf(numeros[valor]);
            resultado = resultado + " ";
            valor++;
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayGenerator arr1 = new ArrayGenerator();
        System.out.println(arr1);
    }
}
