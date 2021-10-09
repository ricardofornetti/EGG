/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author leti
 */
public class EJERCICIO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese una opcion del 1 al 4 ");
        int TipoMotor;
        TipoMotor = leer.nextInt();
        if (TipoMotor >= 1 || TipoMotor <= 4) {
            switch (TipoMotor) {
                case 1:
                    System.out.println(" La bombas es una bomba de agua ");
                    break;
                case 2:
                    System.out.println(" La bombas es una bomba de gasolina ");
                    break;
                case 3:
                    System.out.println(" La bombas es una bomba de hormigón ");
                    break;
                case 4:
                    System.out.println(" La bombas es una bomba de pasta alimenticia ");
                    break;
                default:
                    System.out.println(" NO EXISTE UN VALOR VÁLIDO PARA ESTE TIPO DE BOMBA ");
            }
        }
    }
}
