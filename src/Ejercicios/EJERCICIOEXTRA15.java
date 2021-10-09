
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA15 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print(" Ingrese cantidad de personas n: ");
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(" Ingrese Nombre "+(int)(i+1)+ " : ");
            String nombre = leer.next();
            System.out.print(" Ingrese Edad de "+nombre +" : ");
            int edad=leer.nextInt();
        
        mayoredad(n,nombre,edad);
        menoredad(n,nombre,edad);
        
            
            
        }
    }
    
    static public void mayoredad(int a, String b, int c){
      
        
        //for (int i = 0; i < a; i++) {    
                            
            if (c>=18){
            System.out.println(" La persona "+b+ " es mayor de edad ");
            }               
           }
          
    
    static public void menoredad(int a, String b, int c){
      
        
        //for (int i = 0; i < a; i++) {    
                            
            if (c<18){
            System.out.println(" La persona "+b+ " es menor de edad ");
            }               
           }
           
    
    
    
}


