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
public class Ejercicio7MaximoYminimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int n;
        double numero, suma = 0, promedio, maximo = 0, minimo = 0;

        System.out.print("Ingrese la cantidad de números a ingresar: ");
        n = leer.nextInt();

        int i = 1;
        do {
            System.out.print("Ingrese el número " + i + ": ");
            numero = leer.nextDouble();
            suma += numero;

            if (i == 1) {
                maximo = numero;
                minimo = numero;
            } else {
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }
            i++;
        } while (i <= n);

        promedio = suma / n;

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);
    }
}

