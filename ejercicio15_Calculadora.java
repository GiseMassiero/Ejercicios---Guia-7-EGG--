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
public class ejercicio15_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner leer = new Scanner(System.in);
              
        double num1, num2, resultado = 0;
        String operacion;
        
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextDouble();
        
        System.out.print("Elija una operación a realizar (+, -, *, /): ");
     
         operacion = leer.next();
        
        switch (operacion) {
            case "+":
                resultado = sumar(num1, num2);
                break;
            case "-":
                resultado = restar(num1, num2);
                break;
            case "*":
                resultado = multiplicar(num1, num2);
                break;
            case "/":
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida.");
                System.exit(0);
        }
        
        System.out.println("El resultado de la operación es: " + resultado);
    }
    
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
            System.exit(0);
        }
        return num1 / num2;
    }
}
