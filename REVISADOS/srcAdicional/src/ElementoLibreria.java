import java.util.ArrayList;

public abstract class ElementoLibreria {
	private String nombre;
	
	
	public ElementoLibreria(String n) {
		this.setNombre(n);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getPrecio();
	public abstract double getVolumen();
	public abstract String getMarca();
	public abstract int cantidadProductos();
	public abstract ArrayList<ElementoLibreria> buscar(Filtro condicion);
	public boolean equals(Object o1) {
	
	  try {	
		ElementoLibreria e1 =(ElementoLibreria)o1;
		return nombre.equals(e1.getNombre());
	  } catch(Exception e) {
		  return false;
	  }
	}
	
}
