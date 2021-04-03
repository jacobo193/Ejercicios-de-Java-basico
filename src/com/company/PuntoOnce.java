package com.company;

import java.util.Scanner;

public class PuntoOnce {
    public static void main(String args[]) {
        String miCadena;
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        // usando scanner para oraciones
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduzca la segunda oracion: ");
        miCadena = teclado.nextLine();
        ;


        for (int x = 0; x < miCadena.length(); x++) {
            char actual = miCadena.toLowerCase().charAt(x);

            switch (actual) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Cadena de Texto: '" + miCadena + "'");
        System.out.println("Tamaño de la cadena: " + miCadena.length());
        System.out.println("Total de vocales: " + (a+e+i+o+u));
        System.out.println("Cantidad de a: " + a);
        System.out.println("Cantidad de e: " + e);
        System.out.println("Cantidad de i: " + i);
        System.out.println("Cantidad de o: " + o);
        System.out.println("Cantidad de u: " + u);
    }
}
