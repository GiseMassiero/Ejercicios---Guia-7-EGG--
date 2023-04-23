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
public class Ejercicio10_AdivinarMultiplicación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        int respuesta;

        System.out.println("Adivina la multiplicación entre " + num1 + " y " + num2);

        do {
            System.out.print("Ingresa tu respuesta: ");
            respuesta = leer.nextInt();
            if (respuesta == num1 * num2) {
                System.out.println("¡Respuesta correcta!");
            } else {
                System.out.println("Respuesta incorrecta. Intenta de nuevo.");
            }
        } while (respuesta != num1 * num2);
        
    }
}

