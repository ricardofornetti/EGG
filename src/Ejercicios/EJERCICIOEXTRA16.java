
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        System.out.print(" Ingrese un numero entero : ");
        num = leer.nextInt();
        primo(num);
        
    }
           
    static public void primo(int a){
       boolean resultado;
       int primos=1;
       for (int i = 1; i < a; i++) {
        if(a % i == 0){
           primos = primos+1;
          }            
       }
        if(primos == 2){
            resultado = true;
            System.out.println(resultado);
            System.out.println(" El numero ingresado " +a+ " es primo ");
        }else{
            resultado = false;
            System.out.println(resultado);
            System.out.println(" El numero ingresado " +a+ " NO es primo ");
        }   
            
    }
}
     

