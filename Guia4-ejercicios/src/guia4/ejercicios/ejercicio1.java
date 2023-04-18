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
public class ejercicio1 {
     public static void main(String[] args) {
        //Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
        //La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.
   
    Scanner leer = new Scanner (System.in);
    int num1, num2, op;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.println("Menu\n"
        +"1-sumar\n"
        +"2-resta\n"
        +"3-multiplicar\n"
        +"4-dividir\n"
        +"elija una opcion: ");
        op=leer.nextInt();
        switch(op){
            case 1:
                System.out.println("La suma de los numero es: " +suma(num1, num2));
            break;
            case 2:
                System.out.println("La resta de los numero es: " +resta (num1, num2));
            break;
            case 3:
                System.out.println("La multiplicacion de los numero es: " +mul (num1, num2));
            break;
            case 4:
                System.out.println("La division de los numero es: " +div (num1, num2));

        }
        while (op!=5);
        }
        public static int suma(int num1, int num2){
            num1 += num2;
            return num1;
        }
        public static int resta (int num1, int num2){
            num1 -= num2;
            return num1;
        }
        public static int mul (int num1, int num2){
            num1 *= num2;
            return num1;
        }
        public static int div (int num1, int num2){
            num1 /= num2;
            return num1;
       
    }
}
