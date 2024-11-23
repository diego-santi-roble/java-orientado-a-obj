package com.clases.java;

import java.util.ArrayList;

public class TiendaElectronica extends ProductoElectrodomestico{

private ArrayList<ProductoElectrodomestico> prouductos;

public TiendaElectronica(String nombre, double precio, int cantidadDisponible,
        ArrayList<ProductoElectrodomestico> prouductos) {
    super(nombre, precio, cantidadDisponible);
    this.prouductos = new ArrayList();
}

public void agregarProducto( ProductoElectrodomestico producto){

    prouductos.add(producto);
}
public void mostrar(){
    if(prouductos.isEmpty()){
        System.out.println("no hay productos");
    }else{
        {System.out.println("productos disponibles");
    for(ProductoElectrodomestico producto : prouductos){
        System.out.println(producto);
    }
   } 
  }
 }
public ProductoElectrodomestico buscar(String nombre) {
    for(ProductoElectrodomestico producto : prouductos){
        if(producto.getNombre().equalsIgnoreCase(nombre)){
            return producto;
        }
    }
    System.out.println("no se encuentrael producto");
        return null;

}

public void realizarVenta(String nombreProducto, int cantidadVenta) {
    for (ProductoElectrodomestico producto : prouductos) {
        if (producto.getNombre().equalsIgnoreCase(nombre)) {
            if (producto.getCantidadDisponible() >= cantidadVenta) {
                producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidadVenta);
                System.out.println("Venta realizada, quedan " + producto.getCantidadDisponible() + "unidades disponibles.");
            } else {
                System.out.println("No hay cantidad de este producto .");
            }
            return;
        }
    System.out.println("Producto agotado.");	
    }
}



}
