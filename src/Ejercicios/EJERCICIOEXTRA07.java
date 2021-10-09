package Ejercicios;

import java.util.Scanner;

public class EJERCICIOEXTRA07 {
    
   
     

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] vector;
        int num, num2, cont;
        System.out.print(" Ingrese el valor de n : ");
        num=leer.nextInt();
        vector=new int [num];
        
          cont=0;
          double promedio=0;
          
          // LLENAR MATRIZ      
        do{
            for (int i = 0; i < vector.length; i++) {
            System.out.print(" Ingrese un numero : ");        
                num2 = leer.nextInt();
                cont = cont + 1;
                promedio = promedio +num2;
                vector[i]=vector[i]+num2;
            } 
            
            // IMPRIMIR MATRIZ
            System.out.println(" Vector ");
            for (int i = 0; i < vector.length; i++) {
                System.out.println(vector[i]);                
            }
            
            // MAYOR Y MENOR
            
             int menor, mayor;
             mayor=menor=vector[0];
            for (int i = 0; i < vector.length; i++) {
                if (vector[i]>mayor){
                    mayor = vector[i];
                } 
                    if(vector[i]<menor){
                    menor=vector[i];
                    }
                }
            
        promedio = promedio/num;
        System.out.println(" El mayor de los numeros ingresados es :" + mayor);
        System.out.println(" El menor de los numeros ingresados es :" + menor);   
        System.out.println(" El promedio de los numeros ingresados es :" + promedio); 
        
        }while (cont < num);    
    }         
            
}   
        
        
            
                   
            
            
        
       
    
       
 
