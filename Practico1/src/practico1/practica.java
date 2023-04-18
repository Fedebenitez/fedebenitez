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
public class practica {
    
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        float s,r, milt,div,n,m;
        System.out.println("Ingrese el primer valor: ");
        n = leer.nextFloat();
        System.out.println("Ingrese el segundo valor: ");
        m=leer.nextFloat();
        s = n+m;
        r=n-m;
        milt=n*m;
        div=n/m;
        System.out.println("El valor de la suma es: " +s);  
        System.out.println("El valor de la resta es: " +r);   
        System.out.println("El valor de la multipliacion es: " +milt);   
        System.out.println("El valor de la division es: " +div);   
                
    }
    
}

