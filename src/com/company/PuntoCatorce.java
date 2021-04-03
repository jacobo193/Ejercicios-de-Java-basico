package com.company;

import java.util.Scanner;

public class PuntoCatorce {
    public static void main(String[] ar) {
            int numero;
            int limite=1000;

            Scanner teclado = new Scanner(System.in);

            System.out.print("Introduzca primer número: ");
            numero = teclado.nextInt();

            while(numero <= 1000){
                if(numero%2==0){
                    System.out.println(numero);
                }
                numero++;
            }
        }

}



