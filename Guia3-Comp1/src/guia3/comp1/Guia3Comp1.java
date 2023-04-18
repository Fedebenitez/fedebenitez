/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.comp1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Guia3Comp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dado un tiempo en minutos, calcular su equivalente en días y horas. 
        //Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        
        Scanner leer = new Scanner(System.in);
        int min, hora, dia;
        System.out.println("Ingrese los minutos que desea: ");
        min= leer.nextInt();
        hora = min/60;
        min =  min % 60;
        dia = hora/24;
        hora = hora % 24;
        
        System.out.println("La cantidad de minutos "+ min + "esuivale a "+ dia + " dia y "+ hora + " horas");
        
    }
    
}
