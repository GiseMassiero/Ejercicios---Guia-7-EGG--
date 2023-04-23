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
public class Ejercicio14_N_Familias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Scanner leer = new Scanner(System.in);
        int Familias, numHijos;
        float mediaEdad = 0;
        
        System.out.print("Ingrese el número de familias: ");
        Familias = leer.nextInt();
        
        for (int i = 1; i <= Familias; i++) {
            
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            numHijos = leer.nextInt();
            
            int edadHijos = 0;
            
            for (int j = 1; j <= numHijos; j++) {
                
                System.out.print("Ingrese la edad del hijo " + j + ": ");
                edadHijos += leer.nextInt();
            }
            
            mediaEdad += (float) edadHijos / numHijos;
        }
        
        mediaEdad /= Familias;
        
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}