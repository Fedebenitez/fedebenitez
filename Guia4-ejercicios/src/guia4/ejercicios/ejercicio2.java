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
public class ejercicio2 {
       public static void main(String[] args){
        informe();
    }
        // Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
        //ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa 
        //debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    
     public static void informe(){
        Scanner leer= new Scanner(System.in);
        String nombre, op;
        int n, edad;
    
        do {
            System.out.println("ingrese su nombre: ");
            nombre =leer.next();
            System.out.println("ingrese su edad: ");
            edad = leer.nextInt();
            if( edad >=18){
                System.out.println(nombre +"tiene "+ edad + " años y es mayor de edad");
                  }else{
                    System.out.println(nombre + "tiene " + edad + " años y no es mayor de edad");
                        }
            System.out.println("desea seguir mostrando personas (s/n");
            op=leer.next();
                }while (!op.equalsIgnoreCase("no"));
    } 
}
