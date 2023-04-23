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
public class ejercicio19Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de ambos vectores: ");
        int n = leer.nextInt();
        
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        System.out.println("Ingrese los elementos del vector 1: ");
        /*
         La variable i se utiliza como un contador que irá incrementándose en cada iteración del ciclo.
La segunda parte del for es la condición de repetición, que indica cuándo se debe detener el ciclo. 
        En este caso, la condición es i < n, lo que significa que el ciclo se detendrá cuando la variable i
        sea igual o mayor que el tamaño del vector n
        */
        for (int i = 0; i < n; i++) {
            vector1[i] = leer.nextInt();
        }
        //almacenamos los valores enteros ingresados por el usuario en un vector vector2 
        System.out.println("Ingrese los elementos del vector 2: ");
        for (int i = 0; i < n; i++) {
            vector2[i] = leer.nextInt();
        }
        /*
        comparar los elementos de dos vectores vector1 y vector2 de tamaño n. 
        Se utiliza una variable booleana iguales que se inicializa en true. 
        En cada iteración del bucle, se compara el elemento i del vector vector1
        con el elemento i del vector vector2. Si se encuentra una diferencia, se cambia el valor 
        de iguales a false y se sale del bucle con break
        */
        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        
        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    }
}