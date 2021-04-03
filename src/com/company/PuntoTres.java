package com.company;

import java.util.Scanner;
/* ejercicio 3

 */
public class PuntoTres {

    public static void main(String args[]){
        String radio;
        double area;

        // usando scanner para introducir radio y area por teclado
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduzca segundo radio: ");
         radio = teclado.nextLine();;

        double Radio = Double.parseDouble(radio);

        area = 3.1416 * Math.pow(Radio,2);
        // prints the double value
        System.out.println("el Area de si cirvulo es = " + area);



    }
}
