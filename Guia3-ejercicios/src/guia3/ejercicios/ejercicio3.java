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
public class ejercicio3 {
           //Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
        //Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
        //pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
  String frase;
        System.out.println("Debes ingresar una palabra o frase de 8 caracteres de largo");
        frase = leer.nextLine();
       if (frase.length() == 8 )  {
            System.out.println("tu Frase tiene 8 caracteres Correcto");
        }
       else{
           System.out.println("Tu frase No tiene mas de 8 caracteres Es Incorrecto ");
       }
 
    }
}
