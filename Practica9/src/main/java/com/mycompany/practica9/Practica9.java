/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica9;

import java.util.Arrays;

/**
 *
 * @author fundacion
 */
public class Practica9 {
    public static String[] Repeated(String a){
        String cambio = a.toLowerCase();
        String[] palabras = cambio.split(" ");
        String[] palabras2 = cambio.split(" ");
        int contadorR = 0;
        String[] resultado2 = new String[1];
        StringBuilder resultado = new StringBuilder();
        int cantidad = palabras.length;
        for (int i = 0; i < cantidad; i++){
            int contador = 0;
            String palabra = palabras[i];
            for(int j = 0; j < cantidad; j++){
                if (palabra.equalsIgnoreCase(palabras2[j])){
                    contador++;
                    palabras[j] = "";
                }
            }
            if ((contador > 1) && (contador > contadorR)){
                resultado = new StringBuilder(palabra);
                contadorR = contador;
                System.out.println(palabras[i]);
            }
            else if((contador >1) && (contador == contadorR)){
                resultado.append("").append(palabra);
            }
        }
        resultado.append(",");
        resultado.append(String.valueOf(contadorR));
        resultado2[0] = resultado.toString();
        return resultado2;
    }
    public static void main(String[] args) {
        final String[] c = Practica9.Repeated("This is a repeated word test this is a A");
        System.out.println(Arrays.toString(c));//Should print [a, 3]
        final String[] c1 = Practica9.Repeated("This is a repeated word test this this this this this this");
        System.out.println(Arrays.toString(c1));//Should print [this, 7]
        final String[] c2 = Practica9.Repeated("This is a repeated word test this word word word");
        System.out.println(Arrays.toString(c2));//Should print [word, 4]
    }
}
