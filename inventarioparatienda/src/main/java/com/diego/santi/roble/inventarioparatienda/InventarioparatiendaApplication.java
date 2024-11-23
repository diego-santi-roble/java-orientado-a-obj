package com.diego.santi.roble.inventarioparatienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clases.java.ComputadoraPortatil;
import com.clases.java.Televisor;
import com.clases.java.TiendaElectronica;

@SpringBootApplication
public class InventarioparatiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioparatiendaApplication.class, args);
	
		TiendaElectronica tienda = new TiendaElectronica(null, 0, 0, null);
		Televisor televisor1 = new Televisor("Tele", 333.333, 5, "46","3840.2160");
		ComputadoraPortatil computadora = new ComputadoraPortatil("compu", 500000, 5, "lenovo", 100, 5678123);
	

		tienda.agregarProducto(televisor1);
		tienda.agregarProducto(computadora);

		tienda.realizarVenta("Computadora", 3);	
		tienda.realizarVenta("televisor1", 1);


		tienda.mostrar();

		
		System.out.println("Cantidad de televisores: " + televisor1.getCantidadDisponible());
		System.out.println("Cantidad de computadoras: " + computadora.getCantidadDisponible());

		tienda.realizarVenta("televisor1", 1);
	}  

}
