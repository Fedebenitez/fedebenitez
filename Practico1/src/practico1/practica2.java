/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class practica2 {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        float precio,pago, cambio, falta;
        System.out.println("ingrese el precio del articulo");
        precio= leer.nextFloat();
        System.out.println("cuanto pago el cliente?");
        pago= leer.nextFloat();
        
        cambio= pago - precio;
        falta= precio-pago;
        
        if (cambio<0){
            System.out.println("Falta dinero. El dinero que falta es: " + falta);
        }
        else if (cambio==0){
                System.out.println("El pago es correcto");
           }
        else if (cambio>0){
                System.out.println("El cambio es: " + cambio);
           }
    }
}
           


       
