/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

/**
 *
 * @author Maxi Tapia
 * 
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
     
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        int aux = A; 
// almacenamos temporalmente el valor de A

        B = C;
        C = aux;
        aux = D;
        D = B;
        A = aux;

        // Mostrar valores iniciales y finales de cada variable
        System.out.println("Valores iniciales:");
        System.out.println("A: " + 10);
        System.out.println("B: " + 20);
        System.out.println("C: " + 30);
        System.out.println("D: " + 40);

        System.out.println("\nValores finales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}    
 