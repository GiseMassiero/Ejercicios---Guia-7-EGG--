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
public class ejercicioVocales3 {

    public static void main(String[] args) {
        
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese una letra: ");
    String letra = leer.nextLine().toLowerCase(); 
// se convierte a minúscula para no tener en cuenta mayúsculas

    if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
      System.out.println("La letra ingresada es una vocal.");
    } else {
      System.out.println("La letra ingresada no es una vocal.");
    }
  }
}

