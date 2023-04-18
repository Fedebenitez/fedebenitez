/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ejercicio4 {
      public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, 
        sino false.Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
        Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
        */
        Scanner leer= new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        System.out.println(primo(num));
    }
    public static boolean primo(int num){
        int aux, mod;
        aux=0;
        for (int i = 1; i < num; i++){
            mod = (num % i);
            if (mod == 0){
                aux++;    
            }
        }
        return aux <=1;
        }  
}
