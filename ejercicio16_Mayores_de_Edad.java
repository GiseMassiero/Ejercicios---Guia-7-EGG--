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
public class ejercicio16_Mayores_de_Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner leer = new Scanner(System.in);
        int n = 1;
        String nombre;
        int edad;
        String continuar = "si";
        
        while (continuar.equals("si")) {
            
            System.out.print("Ingrese el nombre de la persona " + n + ": ");
            nombre = leer.next();
            
            System.out.print("Ingrese la edad de la persona " + n + ": ");
            edad = leer.nextInt();
            
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }
            
            System.out.print("¿Quiere seguir mostrando personas? (Si/No): ");
            continuar = leer.next();
            n++;
            if ("no".equals(continuar)){
            }
        }
    }
}

            
            
            

            
         
         
        
    

         
    

