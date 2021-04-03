package com.company;

public class Persona {

    //creando los atributos y tambien aquellos que deben ser por defectos

    private final static char sexoDef = 'H';
    public static final int INFRAPESO = 0;
    public static final int PESO_IDEAL = -1;
    public static final int SOBREPESO = 1;
    private String nombre;
    private String DNI;
    private char sexo;
    private double peso;
    private double talla;
    private int edad;
// contructor por defecto
    public Persona() {
        this("", 0, sexoDef, 0, 0);
    }
// construcores para parametros

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.talla = altura;
        generarDNI();
        this.sexo = sexo;
        comprobarMayoriaDeEdad();
    }

    //Métodos privados
    private void comprobarMayoriaDeEdad() {

        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexoDef;
        }
    }

    private void generarDNI() {
        final int divisor = 23;

        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        //Calculamos la letra del DNI
        char letraDNI = generaLetrasDNI(res);

        //Pasamos el DNI a String
        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetrasDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    //generar los metodos publicos con set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public void setTalla(double altura) {
        this.talla = talla;
    }
    // metodo para calcular IMC
    public int calcularIMC() {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(talla, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return INFRAPESO;
        } else if (pesoActual < 20) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }
    // comprobar si es mayor de edad
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + talla + " metros\n";
    }
}
