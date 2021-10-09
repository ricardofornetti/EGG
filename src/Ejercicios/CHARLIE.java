
package Ejercicios;

import java.util.Scanner;



public class CHARLIE {

   
    public static void main(String[] args) {
       
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de Euros");
        double euro=leer.nextDouble();
        
        
        
        System.out.println("Ingrese la moneda por la que quiere cambiar sus euros");
        System.out.println("A - Libras");
        System.out.println("B - Pesos");
        System.out.println("C - Yenes");      
        
        String moneda=leer.next();
        moneda=moneda.toUpperCase();
        while(!moneda.equals("A")&&!moneda.equals("B")&&!moneda.equals("C")){
            System.out.println("las opciones son A, B, C.");
            
            
moneda=leer.next();
        }
        
       
        
       
      conversor(euro,moneda);
    }//fin algoritmo
    
    public static void conversor(double a, String b){   
                         
            
        switch(b){
            case "A": System.out.println(a+" Euros equivalen a: "+(a*0.86)+" Libras.");
            break;
            case "B": System.out.println(a+" Euros equivalen a: "+(a*1.28611)+" Pesos.");
            break;
            case "C": System.out.println(a+" Euros equivalen a: "+(a*129.852)+" Yenes.");
            
                    
            }        
    }
    
}
    
    

