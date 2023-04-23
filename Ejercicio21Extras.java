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
public class Ejercicio21Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);

        //  Creamos el arreglo de notas
        double[][] notas = new double[10][4];

        // pedimos las notas al usuario
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1) + ":");
            System.out.println("Primer TPE: ");
            notas[i][0] = leer.nextDouble();
            System.out.println("Segundo TPE: ");
            notas[i][1] = leer.nextDouble();
            System.out.println("Primer Integrador: ");
            notas[i][2] = leer.nextDouble();
            System.out.println("Segundo Integrador: ");
            notas[i][3] = leer.nextDouble();
        }

        // calculamos el promedio de cada alumno
        double[] promedios = new double[10];
        for (int i = 0; i < notas.length; i++) {
            promedios[i] = notas[i][0]*0.1 + notas[i][1]*0.15 + notas[i][2]*0.25 + notas[i][3]*0.5;
            /*
            utiliza las notas del alumno que se encuentran en la matriz "notas",
            y aplica los porcentajes correspondientes a cada una de las notas.
            El resultado del cálculo se almacena en la posición "i" del arreglo "promedios",
            correspondiente al alumno "i".
            */
        }

        // Contamos  la cantidad de aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        //imprimimos  la cantidad de aprobados y desaprobados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}

    
