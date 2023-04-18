/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejercicios;

import java.util.Scanner;

/**
 *
 * @author FedericoBenitez
 */
public class Ejercicio1 {
      //Escribir un programa que pida dos números enteros por teclado y calcule 
     //la suma de los dos. El programa deberá después mostrar el resultado de la suma.
    public static void main(String[] args){
    Scanner leer = new Scanner (System.in);
     int numA, numB, suma;
     System.out.print("Ingrese el primer valor: ");
     numA = leer.nextInt();
     System.out.print("Ingrese el segundo valor: ");
     numB = leer.nextInt();
     suma = numA + numB;
     System.out.print("la suma de los valores es: " + suma);
    }
}
