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
public class Ejercicio5 {
    
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
        //el triple y la raíz cuadrada de ese número. 
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n,d,t,r;
        System.out.println("Ingrese un valor numerico: ");
        n = (int) leer.nextDouble();
        d=2*n;
        t=3*n;
        r= (int) Math.sqrt(n);
        System.out.println("El doble del valor es: " + d);
        System.out.println("El triple del valor es: " + t);
        System.out.println("La raiz cuadrada es: " + r);
    }
}
