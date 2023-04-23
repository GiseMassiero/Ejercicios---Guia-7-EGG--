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
public class Ejercicio11Truncar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = leer.nextInt();
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
