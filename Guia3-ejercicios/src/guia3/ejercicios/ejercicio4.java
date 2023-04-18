/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ejercicio4 {
        public static void main(String[] args) {
   // Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
  //Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
  //en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.+
        
  
  Scanner leer = new Scanner(System.in);
  String palabra;
  System.out.println("Ingrese una palabra por favor ");
  palabra = leer.nextLine();
  if (palabra.substring(0,1).equals("A") || palabra.substring(0,1).equals("a")) {
      System.out.println("Correcto");
        } else {
      System.out.println("Incorrecto");
        }
        
    }
}
