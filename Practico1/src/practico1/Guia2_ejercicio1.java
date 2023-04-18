/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Guia2_ejercicio1 {
    public static void main(String [] args) {
    Scanner leer = new Scanner(System.in);
    int numA, numB, suma;
    System.out.println("Ingrese el primer valor " );
    numA = leer.nextInt();
    System.out.println("Ingrese el segundo valor: ");
    numB = leer.nextInt();
    suma= numA + numB;
    System.out.println("la suma es: " + suma);
  
    }
}
