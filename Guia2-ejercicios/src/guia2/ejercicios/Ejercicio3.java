/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Ejercicio3 {
            //Escribir un programa que pida una frase y la muestre toda en 
        //mayúsculas y después toda en minúsculas.
    
    public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        System.out.println("En frase en mayuscula es: " + frase.toUpperCase());
        System.out.println("En frase en minuscula es: " + frase.toLowerCase());
}
}
