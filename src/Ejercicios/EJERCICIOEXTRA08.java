
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA08 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       int num, cont, par, impar;
       cont=par=impar=0;
        do{
            System.out.print(" Ingrese un numero entero :");
            num=leer.nextInt();
            
            if(num<0){
                System.out.println(" Ud ha ingresado un valor negativo ");
                System.out.println(" FIN INGRESO ");
                break;
            }
            cont=cont+1;
            if(num%2!=0){
                impar=impar+1;
            
            }
            else{  
                par=par+1;
            }
            
        }while (num%5!=0);
        System.out.println(" La cantidad de numeros pares ingresados "+par);
        System.out.println(" La cantidad de numeros imares ingresados "+impar);
        System.out.println(" La cantidad de numeros ingresados "+cont);
        
        
        
    }
}  
       
    
    
    
    
    
    
    
    