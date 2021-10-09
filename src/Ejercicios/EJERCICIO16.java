/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.


 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author leti
 */
public class EJERCICIO16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, suma, cont;
        suma = 0;
        cont = 0;
        do {
            System.out.println(" Ingrese un numero ");
            num = leer.nextInt();
            cont = cont + 1;

            if (num > 0) {
                suma = suma + num;
               
            } else if (num == 0) {
                System.out.println(" Ud ha ingresado el valor 0 ");
                break;
            }
        } while (num != 0 && cont <= 19);
        System.out.println(" La suma de los numeros ingresados es " + suma);

    }

}
