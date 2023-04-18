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
public class ejercicio7 {
       public static void main(String[] args) {
        //Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
        //este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un 
        //formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene 
        //que ser X y el último tiene que ser una O.
       //Las secuencias leídas que respeten el formato se consideran correctas, 
       //la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
       //y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
       //Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
        //incorrectas recibidas. 
        
        Scanner leer = new Scanner(System.in);
        String FDE;
        int suma1, suma2;
        suma1 = 0;
        suma2 = 0;
        do {
            do {
                System.out.println("Ingrese la cadena");
                FDE = leer.next();
            } while (FDE.length() != 5);

            if (FDE.substring(4, 5).equalsIgnoreCase("O") && FDE.substring(0, 1).equalsIgnoreCase("X")) {
                suma1 = suma1 + 1;   
               } else {
                suma2 = suma2 + 1;
        }
        } while (!FDE.equalsIgnoreCase("&&&&&"));

        System.out.println("INFORME:\n"
                + "Cantidad de veces correctas: " + suma1 + "\n"
                + "Cantidad de veces incorrectas: " + suma2);
    } 
}
