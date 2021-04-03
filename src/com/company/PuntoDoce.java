package com.company;

import java.util.Scanner;

public class PuntoDoce {
    public static void main(String[] args) {
        String diferencia = "";
        String palabra1;
        String palabra2;


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera palabra");
        palabra1 = sc.nextLine();

        System.out.println("Introduce la primera palabra");
        palabra2 = sc.nextLine();


        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("las 2 palabras son iguales");
        }else{
            for( int i = 0;i < palabra1.length()|| i < palabra2.length(); i++){
                if(i < palabra1.length() && i<palabra2.length()){
                    if(palabra1.charAt(i) != palabra2.charAt(i)){
                        diferencia += palabra2.charAt(i);
                    }
                }else if(i<palabra1.length()){
                    while (i<palabra1.length()){
                        i++;
                    }

                }else{
                    while (i<palabra2.length()){
                        i++;

                    }
                }

            }

        }
        System.out.println("la diferencia es: "+ diferencia);
    }

}
