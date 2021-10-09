
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA14 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1,num2,menu;
        num1=num2=0;
        
        for (int i = 0; i < 1; i++) {
            System.out.print(" Ingrese un numero : ");
            num1=leer.nextInt();
            System.out.print(" Ingrese otro numero : ");
            num2=leer.nextInt();
        }
        
        System.out.println(" ****** MENU ****** ");
            

        
            System.out.println(" 1. SUMAR ");
            System.out.println(" 2. RESTAR ");
            System.out.println(" 3. MULTIPLICAR ");
            System.out.println(" 4. DIVIDIR ");
           
            System.out.print(" ELIJA OPCION : ");
                
            menu = leer.nextInt();
        
        switch (menu){
            case 1: 
                if(menu==1){
                    System.out.println(" La suma de ambos numeros es : "+suma(num1,num2));
                break;
                }
                
            case 2:
                if(menu==2){
                    System.out.println(" La resta de ambos numeros es : "+resta(num1,num2));
                
                break;
                }
            case 3:
                if(menu==3){
                System.out.println(" La multiplicacion de ambos numeros es : "+multiplicacion(num1,num2));
                break;
                }
                case 4:
                if(menu==4){
                System.out.println(" La división de ambos numeros es : "+division(num1,num2));
                break;
                }
                
        }
    }
        
        
    // FUNCION SUMA
    public static int suma(int a, int b){
           int suma = a+b;
            return suma;
    }
    //FUNCION RESTA
    public static int resta(int a, int b){
           int resta = a-b;
            return resta;
    }
    //FUNCION MULTIPLICACION
    public static int multiplicacion(int a, int b){
           int mult = a*b;
            return mult;
       }
    //DIVISION
    public static double division(double a, double b){
           double div = a/b;
            return div;
    }
    
    
    
    
    
}




