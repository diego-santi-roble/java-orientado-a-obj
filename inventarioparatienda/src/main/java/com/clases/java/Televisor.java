package com.clases.java;

public class Televisor extends ProductoElectrodomestico {

public String tamañoPantalla;
public String resolucion;

  public Televisor(String nombre, double precio,int cantidadDisponible,String tamanoPantalla,String resolucion) {

    super(nombre, precio,cantidadDisponible);
    this.tamañoPantalla = tamañoPantalla;
    this.resolucion = resolucion;



    
}
@Override
public void despliegaInformacion(){ 

   System.out.println("Nombre: " + this.nombre + " ,precio: " + this.precio + " ,cantidad disponible: " + this.cantidadDisponible + " ,tamaño pantalla: " + this.tamañoPantalla + ",resolucion:" + this.resolucion);
 }


}