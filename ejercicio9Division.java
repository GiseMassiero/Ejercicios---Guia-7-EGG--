/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Maxi Tapia
 */
public class ejercicio9Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int dividendo, divisor, cociente = 0, residuo;
        
        System.out.println("Ingrese el dividendo: ");
        dividendo = leer.nextInt();
        
        System.out.println("Ingrese el divisor: ");
        divisor = leer.nextInt();
        
        while (dividendo >= divisor); {
        
        dividendo -=divisor;
        
        cociente++;
    }
        residuo = dividendo;
        
        System.out.println("El cociente es: " + cociente);
          System.out.println("El residuo  es: " + residuo);
  
    }
    
}
