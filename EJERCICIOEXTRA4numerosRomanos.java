/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosfinales6;

import java.util.Scanner;

/**
 *
 * @author Maxi Tapia
 */
public class EJERCICIOEXTRA4numerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
     // TODO code application logic here
   
      Scanner  leer = new Scanner(System.in);
            System.out.print("Ingresa un número entre 1 y 10: ");
            int numero = leer.nextInt();
            
            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido, debe estar entre 1 y 10.");
            } else {
                String[] romanos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                String romano = romanos[numero-1];
                System.out.println("El número " + numero + " en romano es: " + romano);
            } 
        
   }
}

