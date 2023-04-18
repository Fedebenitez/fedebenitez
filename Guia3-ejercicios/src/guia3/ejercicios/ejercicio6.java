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
public class ejercicio6 {
        public static void main(String[] args) {
        //Realizar un programa que pida dos números enteros positivos por teclado y
        //muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
        //el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
        //El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
        //si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
        //se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del 
        //programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se 
        //vuelve a mostrar el menú.
    Scanner leer = new Scanner (System.in);
    double num1, num2,resultado;
    int opcion;
    String tecla = "N";
    
    do{
        System.out.println("Ingrese el primer numero ");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero ");
        num2 = leer.nextDouble();

        System.out.println("MENU");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
        System.out.println("Elija una Opcion");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                resultado = num1+num2;
                System.out.println("La suma es " + resultado);
                break;
                
                case 2:
                resultado = num1-num2;
                System.out.println("La resta es " + resultado);
                break;
                
                case 3:
                resultado = num1*num2;
                System.out.println("La multiplicacion es " + resultado);
                break;
                
                
                case 4:
                    if (num2==0){
                       System.out.println("La division no es posible por 0");
                    }else{

                resultado = num1/num2;
                System.out.println("La division es " + resultado);
                }
                break;
                
                case 5:
                System.out.println("Esta seguro que desa salir del programa? (S/N)");
                tecla = leer.next();
                
                    break;
        
             default:
                System.out.println("Opcion Incorrecta");
                break;
        }
   
       } while(tecla.equalsIgnoreCase("N"));

    }
}
