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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner leer = new Scanner(System.in);
        int Num;
        int[] vector;
        int suma = 0;
        
        // Pedimos al usuario que ingrese el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        Num = leer.nextInt();
        
        // Creamos el vector de tamaño N
        vector = new int[Num];
        
        // Pedimos al usuario que ingrese los valores del vector
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < Num; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vector[i] = leer.nextInt();
        }
        
        //Calculamos la suma de todos los elementos del vector
        /*
         es una iteración sobre los elementos de un vector de tamaño Num
        en el que se va sumando el valor de cada elemento al acumulador suma.
         La variable i se utiliza como índice para acceder a cada elemento del vector, 
        empezando por el primer elemento en la posición 0, y terminando en la posición Num-1.
        En cada iteración, se accede al elemento vector[i] y se suma su valor al acumulador suma
        */
        for (int i = 0; i < Num; i++) {
            suma += vector[i];
        }
        
        // Mostramos la suma de los elementos del vector
        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }
}

