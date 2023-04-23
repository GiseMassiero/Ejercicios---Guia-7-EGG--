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
public class Ejercicio6Alturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
      double sumaTotal = 0;
      double sumaBajo160 = 0;
      int n;
  Scanner leer = new Scanner(System.in);
  
      System.out.print("Ingrese la cantidad de personas: ");
      n = leer.nextInt();

      double[] estaturas = new double[n];

      for(int i = 0; i < n; i++) {
         System.out.print("Ingrese la estatura de la persona  [ " + (i+1) + " ] en metros: ");
         estaturas[i] = leer.nextFloat();
         sumaTotal += estaturas[i];
         if (estaturas[i] < 1.60) {
            sumaBajo160 += estaturas[i];
         }
      }

      double promedioTotal = sumaTotal / n;
      double promedioBajo160 = sumaBajo160 / n;

      System.out.println("El promedio de estaturas en general es: " + promedioTotal + " metros");
      System.out.println("El promedio de estaturas por debajo de 1.60 m es: " + promedioBajo160 + " metros");

   }
}
 

