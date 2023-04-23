/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

/**
 *
 * @author Maxi Tapia
 */
public class ejercicio25fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
        public static int fibonacci(int[] vector,int tam) {
        int a, b, c;
        a = 0;
        b = 1;

        for (int i=0; i<tam; i++){
            if (i == (tam-1)){
                System.out.println(b+".");
            }
            else {
                System.out.print(b+", ");
            }
            
            c = a + b;
            a = b;
            b = c;
            
        }
        System.out.println("");
        
        return a;   
    }
    }
    

