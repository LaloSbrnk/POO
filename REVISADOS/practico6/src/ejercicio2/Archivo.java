package ejercicio2;

import java.time.LocalDate;

public class Archivo extends EFS {

	LocalDate fua;
	double tamano;
	
	
	
	public Archivo(String nombre, LocalDate fechaCreacion, LocalDate fua, double tamano) {
		super(nombre, fechaCreacion);
		this.fua = fua;
		this.tamano = tamano;
	}

	public LocalDate getFua() {
		return fua;
	}

	public void setFua(LocalDate fua) {
		this.fua = fua;
	}

	public void setTamano(double val) {
		tamano = val;
	}

	public double getTamano() {
	
		return tamano;
	}

	
	public int getCantidad() {
		return 1;
	}
}
