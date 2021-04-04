package com.company;

public class Main {

    public static void main(String[] args) {
        //Creamos dos arrays de cada tipo de objeto
        Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];

        //Creamos un objeto en cada posicion del array
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("Juego de tronos", "George R. R. Martin ");
        listaSeries[2]=new Serie("Los Simpsons", 31, "Humor", "Matt Groening");
        listaSeries[3]=new Serie("The Outpost", 3 ,"Fantasia", "Jason Falle");
        listaSeries[4]=new Serie("Into the Badlands", 4, "Accion", "AMC");

        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Outsiders 3", 30, "Aventura", "THQ");
        listaVideojuegos[2]=new Videojuego("God of war 3", "Santa Monica");
        listaVideojuegos[3]=new Videojuego("Pokemon zafiro", 40, "Aventura", "Nintendo");
        listaVideojuegos[4]=new Videojuego("The Witcher 3", 140, "Rol", "CD Projekd");

        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();

        int entregados=0;

        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();

            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }

        System.out.println("Hay "+entregados+" articulos entregados");

        Serie serieMayor=listaSeries[0];
        Videojuego videojuegoMayor=listaVideojuegos[0];

        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.MAYOR){
                videojuegoMayor=listaVideojuegos[i];
            }

        }

        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
}
