
package Ejercicios;

import java.util.Scanner;

public class EJERCICIOEXTRA05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
            System.out.println(" ****** MENU ****** ");
            System.out.println(" A. SOCIO CLASE A ");
            System.out.println(" B. SOCIO CLASE B ");
            System.out.println(" C. SOCIO CLASE C ");
            System.out.println(" Dd. SALIR ");
           
           
            System.out.print(" ELIJA OPCION: ");
    
        String menu = leer.next();
        
        switch (menu){
        
            case "a": 
              if (menu.equalsIgnoreCase("A"))
                    System.out.print(" Ingrese el Costo del Tratamiento : ");
                  int num = leer.nextInt();
                  double importe = num*0.5;
                  System.out.println(" Ud tiene un 50% de descuento ");
                  System.out.println(" El importe a abonar por el socio es : $ "+importe);
              break;
            
              case "b": 
              if (menu.equalsIgnoreCase("b"))
                    System.out.print(" Ingrese el Costo del Tratamiento : ");
                   num = leer.nextInt();
                  importe = num - (num*0.35);
                  System.out.println(" Ud tiene un 35% de descuento ");
                  System.out.println(" El importe a abonar por el socio es : $ "+importe);
              break;
              
              case "c": 
              if (menu.equalsIgnoreCase("C"))
                    System.out.print(" Ingrese el Costo del Tratamiento : ");
                   num = leer.nextInt();
                  importe = num;
                  System.out.println(" Ud no tiene descuento ");
                  System.out.println(" El importe a abonar por el socio es : $ "+importe);
              break;
              
              case "d": 
              if (menu.equalsIgnoreCase("D"))
                    System.out.println(" CHAU NOS VEMOS LA PROXIMA ");                  
              break;
        
        
        }
        
        
        
    }
    
}
