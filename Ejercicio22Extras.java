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
public class Ejercicio22Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz = new int[4][5]; // Creamos una matriz de tamaño 4x5
        Random aleatorio = new Random(); // Creamos un objeto Random para generar valores aleatorios
        int suma = 0; // Inicializamos la variable que almacenará la suma de los elementos de la matriz
        
        // Rellenamos la matriz con valores aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = aleatorio.nextInt(10); // Generamos un número aleatorio entre 0 y 9
            }
        }
        
        // Mostramos la matriz por pantalla
        /*
        El primer bucle for recorre las filas de la matriz (de 0 a N-1) 
        y el segundo bucle for recorre las columnas de la matriz (de 0 a M-1).
        En cada iteración del bucle interior, generamos un número aleatorio entre 0 y 9
        usando el método nextInt del objeto
        */
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                
                System.out.print(matriz[i][j] + " ");
                
                suma += matriz[i][j]; // Sumamos el valor actual al acumulado de la suma
            }
            System.out.println(); // Saltamos a la siguiente línea después de imprimir cada fila
        }
        
        // Mostramos la suma de los elementos de la matriz
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
}

