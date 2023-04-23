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
public class EJERCICIO24SopadeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        Scanner read = new Scanner (System.in);
        Random aleatorio = new Random();
        String[][] sopaletras = new String[20][20];
        int f = 0;
        int c = 0;
        int num;

        System.out.println("Ingrese 5 palabras(Entre 3 y 5 de longitud):");
        
        for (int i=0;i<20;i++){
            for(int k=0;k<20;k++){
                num = aleatorio.nextInt(9);
                String Naleatorio = String.valueOf(num);
                sopaletras[i][k] = Naleatorio;
            }
        }
        
        int f1;
        int c1;
        int C2=0;
        int F2=0;
        
        for (int i=0;i<5;i++){
            System.out.print((i+1)+"º palabra: ");
            String palabra = read.nextLine();
        
            while (palabra.length()>5 || palabra.length()<3){
                System.out.println("Ingrese nuevamente una palabra:");
                palabra = read.nextLine();
                if (palabra.length()<=5 && palabra.length()>=3){
                    System.out.println((i+1)+"º palabra: "+palabra);
                }
            }
            
            f1 = aleatorio.nextInt(20);
            c1 = aleatorio.nextInt(15);
            
            if (i == 0){
                C2 = c1;
                F2 = f1;
            }
            
            if (f1 == F2 && i>0){
                if (c1 <= (C2+5)){
                    c1 = C2+5;
                }
                if (c1 >= (C2-5) && (C2-5)>0){
                    c1 = C2-5;
                }
            }
            
            F2 = f1;
            C2 = c1;

            for(int k=0;k<palabra.length();k++){
                palabra = palabra.toUpperCase();
                sopaletras[F2][C2+k] = palabra.substring(k,k+1);
            }
            
        }

        System.out.println("");
        System.out.println("----------------SOPA-DE-LETRAS----------------");
        System.out.println("Encuentra las palabras que ingresaste.");
        System.out.println("");
        
        for (int i=0;i<20;i++){
            for(int k=0;k<20;k++){
                System.out.print(""+sopaletras[i][k]+" ");
            }
            System.out.println("");
        }
        System.out.println("");

    }
    }
    
