package com.company;

class Television extends Electrodomestico{

        //Constantes
        private final static int resolucionPorDefecto = 20;

        //Atributos
        private int resolucion;
        private boolean sintonizadorTDT;

        //Métodos publicos

        public double precioFinal(){
            //Invocamos el método precioFinal del método padre
            double plus=super.precioFinal();

            //Añadimos el codigo necesario
            if (resolucion>40){
                plus+=precioBase*0.3;
            }
            if (sintonizadorTDT){
                plus+=50;
            }

            return plus;
        }

        //Constructor

        public Television(){
            this(PresioBasePorDefecto, PesoBasePorDefecto, consumoPorDefecto, colorPorDefecto, resolucionPorDefecto, false);
        }

        public Television(double precioBase, double peso){
            this(precioBase, peso, consumoPorDefecto, colorPorDefecto, resolucionPorDefecto, false);
        }


        public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
            super(precioBase, peso, consumoEnergetico, color);
            this.resolucion=resolucion;
            this.sintonizadorTDT=sintonizadorTDT;
        }

}
