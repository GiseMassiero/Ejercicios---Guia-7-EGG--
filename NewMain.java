/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maxi Tapia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        Random aleatorio = new Random();
        
        System.out.print("Ingrese el tamaño del vector: ");
        int num = leer.nextInt();
        int[] vector = new int[num];
        
        for (int i=0; i<num; i++){
            vector[i] = aleatorio.nextInt(20)+20;
        }
        System.out.println("vector: ");
        for (int i=0; i<num; i++){
            System.out.print("["+vector[i]+"] ");
        }
        
        System.out.println("");
        System.out.println("Ingrese un numero a buscar en el vector: ");
        int num1 = leer.nextInt();
        
        for (int i=0; i<vector.length; i++){
            if (vector[i]==num1){
                System.out.println("Se encontro en el indice "+(i+1));
            }
        }
    }
    
}
