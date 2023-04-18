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
public class ejercicio3 {
      public static void main(String[] args) {
        //Crea una aplicación que a través de una función nos convierta una cantidad de euros 
        //introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
        //La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será 
        //una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

        Scanner leer = new Scanner(System.in);
        double E;
        String op;
        System.out.println("Ingrese la cantidad que quiere cambiar");
        E = leer.nextInt();
        System.out.println("a que moneda quiere convertir? (L/D/Y)");
        op= leer.next();
        Cambio(op,E);
 }
 public static void Cambio(String op, double E){
     String l,d,y;
    switch (op.toLowerCase()){
        case "l":
            E *=0.86;
            l= String.valueOf(E);
            System.out.printf("su conversion es de: %.2f libras", E);
            break;
        case "d":
            E*=1.28611;
            d=String.valueOf(E);
            System.out.printf("su conversion es de: %.2f dolares", E);
            break;
            case "y":
            E*=129856;
            y = String.valueOf(E);
            System.out.printf("su conversion es de: %.2f yenes", E);
            break;
        default:
            throw new AssertionError();
    }
        
    }  
}

