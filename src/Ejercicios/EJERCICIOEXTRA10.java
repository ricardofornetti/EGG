
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA10 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [] vector;
        vector = new int [2];
        int multiplicar = 1;
        
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10 + 0);
            System.out.println(vector[i]);
        }
            
            
        for (int i = 0; i < vector.length; i++) {
             multiplicar= multiplicar*vector[i];
        }
         
        System.out.println(" multiplicacion es : "+multiplicar);
        int num=101;
              
        
        while(num!=multiplicar){
        System.out.print(" Ingrese un numero n = ");
        num=leer.nextInt(); 
            System.out.println(" Numero ingresado INCORRECTO");
        }
        System.out.println(" Numero ingresado CORRECTO");
    }
}

