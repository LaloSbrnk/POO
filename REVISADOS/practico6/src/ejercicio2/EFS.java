package ejercicio2;

import java.time.LocalDate;

public abstract class EFS {
	
	private String nombre;
	private LocalDate fechaCreacion;
	
	
	public EFS(String nombre, LocalDate fechaCreacion) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public abstract double getTamano(); 


	public boolean equals(Object o1) {
		EFS ef = (EFS)o1;
		return ef.getNombre().equals(nombre);
	}

	public abstract int getCantidad();
}
