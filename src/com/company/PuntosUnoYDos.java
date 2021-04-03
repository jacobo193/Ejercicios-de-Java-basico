package com.company;
import java.util.Scanner;

/**
 * puntos 1 y 2 del taller de ejercicos de java
 */
public class PuntosUnoYDos {

    public static void main(String args[]) {
//declarando las 2 variables
        int a, b;
// usando scanner para introducir varibles por teclado
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca primer número: ");
        a = teclado.nextInt();

        System.out.print("Introduzca segundo número: ");
        b = teclado.nextInt();

// mostrando por si las varibles son iguales  o una es mayor
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a != b);
        
    }

}
