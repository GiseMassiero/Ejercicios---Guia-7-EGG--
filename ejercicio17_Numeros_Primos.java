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
public class ejercicio17_Numeros_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner leer = new Scanner(System.in);
           
        System.out.print("Ingrese un número: ");
        int numero = leer.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        /*
        esta línea de código define un ciclo que va desde 2
        hasta la mitad del número que se está verificando, 
        probando si el número es divisible por cada valor en ese rango. 
        Si se encuentra un valor en ese rango que divide al número,
        entonces sabemos que el número no es primo y salimos del ciclo. 
        Si no se encuentra ningún divisor en ese rango, entonces sabemos que el número es primo.
        */
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
