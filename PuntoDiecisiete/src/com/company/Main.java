package com.company;

public class Main {

    public static void main(String[] args) {
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];

        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Electrodomestico(300, 40, 'a', "Verde");
        listaElectrodomesticos[1]=new Lavadora(200, 35);
        listaElectrodomesticos[2]=new Television(600, 90, 'E', "negro", 50, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(300, 10, 'D', "gris");
        listaElectrodomesticos[5]=new Lavadora(450, 45, 'Z', "blanco", 40);
        listaElectrodomesticos[6]=new Television(750, 80);
        listaElectrodomesticos[7]=new Lavadora(400, 100, 'A', "blanco", 20);
        listaElectrodomesticos[8]=new Television(200, 60, 'C', "negro", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(100, 120);

        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;

        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listaElectrodomesticos.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */

            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }

        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
    }

}
