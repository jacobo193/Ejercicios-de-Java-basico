package com.company;public


class Lavadora extends Electrodomestico {

    //Constantes
    private final static int cargaPorDefecto=5;

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
        this(PresioBasePorDefecto, PesoBasePorDefecto, consumoPorDefecto, colorPorDefecto, cargaPorDefecto);
    }


    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, consumoPorDefecto, colorPorDefecto, cargaPorDefecto);
    }


 
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}
