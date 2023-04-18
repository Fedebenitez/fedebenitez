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
public class ejercicio2 {
       public static void main(String[] args) {
        //Crear un programa que pida una frase y si esa frase es igual a “eureka” 
        //el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto
        
               Scanner bandera = new Scanner(System.in);
        String sCadena1 ;
        System.out.println("ingrese una Cadena de texto");
        sCadena1 = bandera.nextLine();
        if (sCadena1.equals("eureka")) {
            System.out.println(sCadena1 +  "  Es correcto");
       
        } else {
            System.out.println(sCadena1 + " y " + " Incorrecto ");
        }

    }
}
