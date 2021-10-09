/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
package Ejercicios;

import java.util.Scanner;


public class EJERCICIOEXTRA02 {

    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        int a,b,c,d, aux;
        System.out.print(" Ingrese un valor para A = ");
        a = leer.nextInt();
        System.out.print(" Ingrese un valor para B = ");
        b = leer.nextInt();
        System.out.print(" Ingrese un valor para C = ");
        c = leer.nextInt();
        System.out.print(" Ingrese un valor para D = ");
        d = leer.nextInt();
        System.out.println(" ---DATOS INGRESADOS--- ");
        System.out.println(" A = "+a);
        System.out.println(" B = "+b);
        System.out.println(" C = "+c);
        System.out.println(" D = "+d);
        
        System.out.println(" ---LUEGO DE LA CONVERSION--- ");
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        
        System.out.println(" A = "+a);
        System.out.println(" B = "+b);
        System.out.println(" C = "+c);
        System.out.println(" D = "+d);        
        
    }
    
}
