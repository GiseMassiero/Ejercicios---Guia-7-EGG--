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
public class ejercicio13_Escaleras_de_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner leer = new Scanner(System.in);

        // Pedir altura de la escalera
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();

        // Dibujar escalera
        for (int i = 1; i <= altura; i++) {
            // Dibujar cada línea de la escalera
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Pasar a la siguiente línea
            System.out.println();
        }
    }
}
/*
En este caso, la variable de control j se inicializa en 1,
la condición es que j sea menor o igual a i (que es el número de la línea actual de la escalera), 
y la expresión de actualización se ejecuta al final de cada iteración y aumenta el valor de j en 1.

Esto significa que el bucle interno se ejecutará una vez para cada número entero desde 1
hasta el número de la línea actual de la escalera,
*/