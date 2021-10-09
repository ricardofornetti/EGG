package Ejercicios;

import java.util.Scanner;

public class EJERCICIO23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print(" Ingrese la cardinalidad n del vector : ");
        int n = leer.nextInt();
        int[] vector;
        vector = new int[n];

        //COMPLETAR EL VECTOR CON NUMEROS ALEATORIOS
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100 + 1);
            System.out.println(vector[i]);
            
            //vector[i] = random.nextInt((10 - 0) + 0) ; 
            //random.nextInt
            //((MAX - min) + min)
        }
        
        // SOLICITAR NUMERO A BUSCAR
        System.out.print(" Ingrese un numero a buscar dentro del vector : ");
        int numbuscar = leer.nextInt();

        // BUSCAR NUM EN EL VECTOR
        int posicion = -1;
        for (int i = 0; i <vector.length; i++) {
            if (vector[i] == numbuscar){
                posicion = i;
            }
        }
        
        if (posicion == -1){
            System.out.println(" El valor "+ numbuscar + " no se encuentra dentro del vector ");
            
        } else {
            System.out.println(" El valor " + numbuscar + " se encuntra en la posicion "+ posicion);
            
        }
    }

}
