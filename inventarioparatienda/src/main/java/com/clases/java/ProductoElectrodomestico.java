package com.clases.java;

public class ProductoElectrodomestico {

    public String nombre;
    public double precio;
    public int cantidadDisponible;
    
    
     public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    


    public ProductoElectrodomestico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = 0;
    }

      


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getCantidadDisponible() {
        return cantidadDisponible;
    }


    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

   public void despliegaInformacion(){
    System.out.println("Nombre: " + this.nombre + " ,precio: " + this.precio + " ,cantidad disponible: " + this.cantidadDisponible);
  
   }


}
