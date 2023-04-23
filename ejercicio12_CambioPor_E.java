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
public class ejercicio12_CambioPor_E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    /*
                    si el valor de la variable "i" es igual a 3.
                    Si la condición es verdadera, se asigna el valor "E" a la variable "str1", 
                    de lo contrario, se convierte el valor de "i" a una cadena usando el método Integer.toString()
                     convierte un valor entero a su representación en formato de cadena de caracteres 
                    */
                    String str1 = (i == 3) ? "E" : Integer.toString(i);
                    String str2 = (j == 3) ? "E" : Integer.toString(j);
                    String str3 = (k == 3) ? "E" : Integer.toString(k);
                    System.out.println(str1 + "-" + str2 + "-" + str3);
                }
            }
        }
    }
}
/*
Se utiliza un bucle for para iterar sobre los números del 0 al 9 para el primer dígito.
Dentro del bucle for del primer dígito, se utiliza otro bucle for para iterar sobre los números del 0 al 9
para el segundo dígito.
Dentro del bucle for del segundo dígito, se utiliza otro bucle for para iterar sobre los números del 0 al 9
para el tercer dígito.
Dentro del bucle for del tercer dígito, se utiliza un operador ternario para comprobar si el valor actual 
de cada dígito es igual a 3.
Si el valor del dígito es 3, se asigna la letra "E" a una variable de tipo String llamada str en lugar del 
número 3.
*/