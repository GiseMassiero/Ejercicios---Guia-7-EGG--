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
public class EJERCICIOEXTRA5ObrasSociales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      Scanner leer = new Scanner(System.in);

      System.out.print("Ingrese la letra que representa la clase de socio (A, B o C): ");
      char claseSocio = leer.next().charAt(0);

      System.out.print("Ingrese el costo del tratamiento: ");
      double costoTratamiento = leer.nextDouble();

      double descuento = 0.0;

      if (claseSocio == 'A') {
         descuento = costoTratamiento * 0.5;
      } else if (claseSocio == 'B') {
         descuento = costoTratamiento * 0.35;
      }

      double importeAPagar = costoTratamiento - descuento;
      
      System.out.println("El importe en efectivo a pagar es: " + importeAPagar);

      leer.close();
   }
}

