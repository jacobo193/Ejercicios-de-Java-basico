package com.company;

public class Electrodomestico {
    protected final static String COLOR_POR_DEFECTO ="blanco";
    protected final static char CONSUMO_POR_DEFECTO ='F';
    protected final static double PRESIO_BASE_POR_DEFECTO =100;
    protected final static double PESO_BASE_POR_DEFECTO =5;

    //Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    //Métodos privados

    private void comprobarColor(String color){

        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;

        for(int i=0;i<colores.length && !encontrado;i++){

            if(colores[i].equals(color)){
                encontrado=true;
            }

        }

        if(encontrado){
            this.color=color;
        }else{
            this.color= COLOR_POR_DEFECTO;
        }


    }

    public void comprobarConsumoEnergetico(char consumoEnergetico){

        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico= CONSUMO_POR_DEFECTO;
        }

    }

    //Métodos publicos

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }


    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double precioFinal(){
        double plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }

        return Plus(plus);
    }

    private double Plus(double plus) {
        if(peso>=0 && peso<19){
            plus +=10;
        }else if(peso>=20 && peso<49){
            plus +=50;
        }else if(peso>=50 && peso<=79){
            plus +=80;
        }else if(peso>=80){
            plus +=100;
        }

        return precioBase+ plus;
    }

    //Constructores


    public Electrodomestico(){
        this(PRESIO_BASE_POR_DEFECTO, PESO_BASE_POR_DEFECTO, CONSUMO_POR_DEFECTO, COLOR_POR_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_POR_DEFECTO, COLOR_POR_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
}
