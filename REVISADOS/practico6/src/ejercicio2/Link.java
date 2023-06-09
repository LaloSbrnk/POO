package ejercicio2;

import java.time.LocalDate;

public class Link extends EFS {

	EFS apuntado;
	private static double tamDefecto = 1;
	
	
	
	public EFS getApuntado() {
		return apuntado;
	}

	public void setApuntado(EFS apuntado) {
		this.apuntado = apuntado;
	}

	public static double getTamDefecto() {
		return tamDefecto;
	}

	public static void setTamDefecto(double tamDefecto) {
		Link.tamDefecto = tamDefecto;
	}

	public Link(String nombre, LocalDate fechaCreacion, EFS apuntado) {
		super(nombre, fechaCreacion);
        this.apuntado = apuntado;
	}

	@Override
	public double getTamano() {
        return tamDefecto;
	}

	@Override
	public int getCantidad() {
		return 1;
	}
	
	public String getNombre() {
		return apuntado.getNombre()+"[" +super.getNombre()+"]";
	}

}
