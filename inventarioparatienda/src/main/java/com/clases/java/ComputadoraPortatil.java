package com.clases.java;

public class ComputadoraPortatil extends ProductoElectrodomestico {

public String marca;
public int memoria;
public int numeroSerie;

public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoria,
        int numeroSerie) {

    super(nombre, precio, cantidadDisponible);
    this.marca = marca;
    this.memoria = memoria;
    this.numeroSerie = numeroSerie;
}

@Override
public void despliegaInformacion(){ 

   System.out.println("Nombre: " + this.nombre + " ,precio: " + this.precio + ",marca:"+ this.marca + ",memoria:" + this.memoria + ",numeroSerie:" + this.numeroSerie);

 }
 
}