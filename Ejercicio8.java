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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner leer = new Scanner(System.in);
        int numero, cantidadNumeros = 0, cantidadPares = 0, cantidadImpares = 0;

        while (true) {
            System.out.print("Ingrese un número entero: ");
            numero = leer.nextInt();

            if (numero % 5 == 0) {
                break;
            }

            if (numero < 0) {
                continue;
            }

            cantidadNumeros++;
            if (numero % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
}

