package com.company;

import java.util.Scanner;

public class PuntoDiez {
    public static void main(String args[]) {
        String oracion1;
        String oracion2;


        // usando scanner para oraciones
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduzca la oracion: ");
        oracion1 = teclado.nextLine();;

        oracion2 = oracion1.replace(" ","");
        System.out.println("la oracion que usted introdujo es:" +oracion1 + "y paso a ser:" + oracion2);



    }

}
