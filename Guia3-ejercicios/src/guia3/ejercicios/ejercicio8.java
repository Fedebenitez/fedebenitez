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
public class ejercicio8 {
        public static void main(String[] args) {
        //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
        //Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        
        Scanner leer = new Scanner(System.in);
        int num,i,j,k;
        System.out.println("Ingrese el tamaño del cuadrado: ");
        num = leer.nextInt();
        
        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                if (i == 0 || i == num-1 || j == 0 || j == num-1) {
                    System.out.print(" * ");
                }else if (i==j) {
                    for (k=0; k<(num-2); k++){
                    System.out.print("   ");
                }
              }

            }
            System.out.println("");
        }
    }
}
