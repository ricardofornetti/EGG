/*
 Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
 */
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA06 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print(" Ingrese la cantidad de personas : ");
        int personas = leer.nextInt();
        double estatura;
        double menor, mayor;
        int cont,cont1;
        menor = 0;
        mayor = 0;
        cont=0;
        cont1=0;
        do{
            
            System.out.print(" Ingrese Estatura : ");
            estatura = leer.nextDouble();
                if (estatura < 1.6){
                    menor = menor + estatura;
                    cont=cont+1;
                } else{
                    mayor=mayor+estatura;
                cont1=cont1+1;
             }
        
            }while ((cont+cont1)<personas);
        
        double prom_menor = menor/cont;
        double prom_mayor = mayor/cont1;
        double promedio = (menor+mayor)/personas;
        System.out.println(" El promedio de personas con estatura < 1.6 mts es : "+prom_menor);
        System.out.println(" El promedio de personas con estatura > 1.6 mts es : "+prom_mayor);
        System.out.println(" El promedio general de estaturas es : "+promedio);
        }
    }
    

