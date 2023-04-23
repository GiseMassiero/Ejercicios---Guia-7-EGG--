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
public class Ejercicio23Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        char[][] sopaDeLetras = new char[20][20];
        
        // Pedimos al usuario que ingrese las palabras
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra " + (i+1) + ": ");
            palabras[i] = leer.next().toUpperCase();
        }
        
        // Colocamos las palabras en la sopa de letras
        int fila = (int) (Math.random() * 20);
        int columna = 0;
        
        for (int i = 0; i < 5; i++) {
            String palabra = palabras[i];
            int longitudPalabra = palabra.length();
            
            // Si la palabra es mayor que el espacio restante en la fila, la colocamos en la siguiente fila
            if (columna + longitudPalabra > 20) {
                fila++;
                columna = 0;
            }
            
            /*
            La variable j es un contador que se utiliza para recorrer cada uno de los caracteres de la palabra.
            La condición j < longitudPalabra indica que el ciclo debe continuar mientras no se hayan recorrido
            todos los caracteres de la palabra.
            */
            for (int j = 0; j < longitudPalabra; j++) {
                sopaDeLetras[fila][columna] = palabra.charAt(j);
               
                columna++;
            }
            /*
            La variable fila indica la fila en la que se encuentra la palabra, 
            que se selecciona de manera aleatoria. La variable columna indica la columna 
            en la que se va ubicando cada uno de los caracteres de la palabra.
Después de ubicar el carácter en la sopa de letras, se incrementa la variable columna 
            con la instrucción columna++. Esto se hace para que el próximo carácter de la palabra 
            se ubique en la siguiente columna de la sopa de letras. De esta manera, se van ubicando 
            todos los caracteres de la palabra en orden horizontal en una fila de la sopa de letras.
            */
            columna++; // Agregamos un espacio entre palabras
        }
        
        // Rellenamos los espacios vacíos con números aleatorios
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaDeLetras[i][j] == '\0') { // Si el espacio está vacío, agregamos un número aleatorio
                    sopaDeLetras[i][j] = (char) (Math.random() * 10 + '0');
                }
            }
        }
        
        // Imprimimos la sopa de letras por pantalla
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}