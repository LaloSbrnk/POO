package ejercicio2;

import java.time.LocalDate;

public class Zip extends Directorio {

	private double comp;
	
	public Zip(String nombre, LocalDate fechaCreacion, double ta) {
		super(nombre, fechaCreacion);
	   comp = ta;	
	
	}

	public double getTamano() {
		double tam = super.getTamano();
		if (comp!=0) {
			return tam/comp;
		}else {
			return tam;
		}
	}
	public int getCantidad() {
		return 1;
	}
	
}
