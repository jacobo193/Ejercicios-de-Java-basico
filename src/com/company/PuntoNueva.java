package com.company;

import java.util.Scanner;

public class PuntoNueva {
    public static void main(String args[]) {
        String oracion1 = "La sonrisa serala mejor arma contra la tristeza";
        String oracion2;
        String oracion3;

        // usando scanner para oraciones
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduzca la segunda oracion: ");
        oracion2 = teclado.nextLine();;

        oracion3 = oracion1.replace('a','e');
        System.out.println("la oracion:" +oracion1 + " paso a:" + oracion3 + "y la oracion que usted introdujo fue:" + oracion2);




    }


}
