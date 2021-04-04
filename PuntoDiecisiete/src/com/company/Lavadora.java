package com.company;public


class Lavadora extends Electrodomestico {

    //Constantes
    private final static int CARGA_POR_DEFECTO =5;

    //Atributos
    private int carga;

    //Métodos publicos

  
    public int getCarga() {
        return carga;
    }
    
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.precioFinal();
        if (carga>30){
            plus+=50;
        }

        return plus;
    }

    //Constructor
    public Lavadora(){
        this(PRESIO_BASE_POR_DEFECTO, PESO_BASE_POR_DEFECTO, CONSUMO_POR_DEFECTO, COLOR_POR_DEFECTO, CARGA_POR_DEFECTO);
    }


    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_POR_DEFECTO, COLOR_POR_DEFECTO, CARGA_POR_DEFECTO);
    }


 
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}
