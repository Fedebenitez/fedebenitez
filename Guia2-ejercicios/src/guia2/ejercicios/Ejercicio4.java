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
public class Ejercicio4 {
    
         //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
         //La fórmula correspondiente es: F = 32 + (9 * C / 5).
    
       public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        int C,F;
        System.out.print("Ingrese la temperatura en grados centigrados: ");
        C = leer.nextInt();
        F = 32 + (9 * C / 5);
        System.out.print("La temperatura en grados Fahrenheit es: " + F);

    }
}
