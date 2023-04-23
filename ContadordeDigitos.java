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
public class ContadordeDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

     Scanner leer = new Scanner (System.in);
             
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        
        int[] vector = new int[n];

        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        
        System.out.println("Ingrese valores en el vector:");

        for (int i=0;i<n;i++){
            vector[i] = leer.nextInt();
            String cadena = String.valueOf(vector[i]);
            int digito = cadena.length();
            
            if (digito==1){
                a++;
            }
            else if (digito==2){
                b++;
            }
            else if (digito==3){
                c++;
            }
            else if (digito==4){
                d++;
            }
            else if (digito==5){
                e++;
            }
            else {
                f++;
            }
        }
        
        System.out.println("");
        System.out.println("-----------CONTABILIZANDO-----------");
        System.out.println("");
        
        System.out.println("Números de 1 digito: " +a);
        System.out.println("Números de 2 digito: " +b);
        System.out.println("Números de 3 digito: " +c);
        System.out.println("Números de 4 digito: " +d);
        System.out.println("Números de 5 digito: " +e);
        System.out.println("Números de más de 5 digitos: " +f);
        
        System.out.println("");
    }
    
}
