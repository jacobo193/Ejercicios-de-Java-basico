package com.company;


import java.util.Scanner;

public class PuntoSiete {
    public static void main(String args[]) {
        int numero;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero mayor que cero");
            numero = sc.nextInt();
        }while(numero <= 0);
        System.out.println(numero);
    }
}
