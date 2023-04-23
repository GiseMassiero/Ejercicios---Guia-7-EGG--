/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

import java.util.Random;

/**
 *
 * @author Maxi Tapia
 */
public class ejercicio20Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] vector = new int[10]; // creamos un vector de tamaño 10
        rellenarVectorAleatorio(vector); // llamamos a la función para rellenar el vector
        imprimirVector(vector); // llamamos al procedimiento para imprimir el vector
    }

    //  rellenamos el vector con números aleatorios
    public static void rellenarVectorAleatorio(int[] vector) {
        Random rand = new Random(); // creamos un objeto Random para generar números aleatorios
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100); 
             // generamos un número aleatorio entre 0 y 99 y
            //lo asignamos al elemento i del vector
        }
    }
    // procedimiento que imprime el vector
    public static void imprimirVector(int[] vector) {
        System.out.print("Vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " "); // imprimimos el elemento i del vector
   
        }
    }        
}   
