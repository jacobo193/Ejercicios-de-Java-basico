package com.company;

import java.util.Scanner;
/* ejercicio 4

 */
public class PuntoCuatro {
    public static void main(String args[]) {
        float presio;
        double IVA = 0.21;
        double presioMasIva;


        // usando scanner para introducir presio del producto
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduzca la base ponible: ");
        presio = teclado.nextFloat();;

        presioMasIva= presio*IVA;
        System.out.println("el presio de su producto  es = " + presioMasIva);


    }
}
