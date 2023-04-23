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
public class ejercicio1_HorasYminutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un tiempo en minutos: ");
        int minutos = leer.nextInt();

        int horas = minutos / 60;
        int dias = horas / 24;
        horas = horas % 24;

        System.out.println(minutos + " minutos equivalen a " + dias + " día(s) y " + horas + " hora(s).");
    }
} 

