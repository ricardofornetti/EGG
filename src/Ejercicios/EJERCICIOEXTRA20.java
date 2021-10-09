
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA20 {

    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      String nombre;
     double nota1,nota2,nota3,nota4, promedio;
     int aprobados,desaprobados;
    
      
      aprobados=desaprobados=0;
      
        for (int i = 0; i < 2; i++) {
            System.out.print(" Ingrese Nombre y Apellido Alumno : ");
            nombre = leer.next();
            System.out.print(" Ingrese Nota Primer TP : ");
            nota1=leer.nextDouble();
            System.out.print(" Ingrese Nota Segundo TP : ");
            nota2=leer.nextDouble();
            System.out.print(" Ingrese Nota Primer Integrador : ");
            nota3=leer.nextDouble();
            System.out.print(" Ingrese Nota Segundo Integrador : ");
            nota4=leer.nextDouble();
            promedio = 0.1*nota1+.15*nota2+.25*nota3+.5*nota4;
            System.out.println(" El promedio del alumno "+nombre+ " es = "+promedio);
            
            if (promedio >=7){
            aprobados=aprobados+1;
            
            }else{
            desaprobados=desaprobados+1;
            }
        }
        System.out.println(" ----RESUMEN---- ");
        System.out.println(" APROBADOS = " + aprobados);
        System.out.println(" DESAPROBADOS " + desaprobados);
        
        
        
        
        
    }
    
}
