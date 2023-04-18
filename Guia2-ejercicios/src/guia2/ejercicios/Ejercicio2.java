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
public class Ejercicio2 {
     //Escribir un programa que pida tu nombre, 
     //lo guarde en una variable y lo muestre por pantalla
        public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        String nombre;
        System.out.print("Como te llamas? ");
        
        nombre = leer.next();
        System.out.print("Hola " + nombre + " un gusto saludarte");
        
    }
}
