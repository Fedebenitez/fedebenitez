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
public class ejercicio5 {
        public static void main(String[] args) {
        //Escriba un programa en el cual se ingrese un valor limite positivo,
        //y a continuacion solicite numeros al usuario hasta que la suma de los números 
        //introducidos supere el limite inicial.
       
        Scanner leer = new Scanner(System.in);
        int limite, numero, suma;
        System.out.println("Ingrese el limite que desea");
        limite = leer.nextInt();
        suma = 0;
        while (suma <= limite){
   
        System.out.println("Ingrese un numero por favor");
        numero = leer.nextInt();
        
        suma = suma + numero;
        
            }
        System.out.println("La suma es " + suma );
    }
}
