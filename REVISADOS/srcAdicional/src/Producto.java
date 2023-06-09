import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Producto extends ElementoLibreria{

	
	private String marca;
	private double precio;
	private double volumen;
	
	
	
	
	
	
	public Producto(String nombre, String marca, double precio, double volumen) {
		super(nombre);
	
		this.marca = marca;
		this.precio = precio;
		this.volumen = volumen;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	
	public int cantidadProductos() {
		return 1;
	}
	
	public ArrayList<ElementoLibreria> buscar(Filtro condicion){
		ArrayList<ElementoLibreria> salida = new ArrayList<ElementoLibreria>();
		
		if (condicion.cumple(this))
			salida.add(this);
		
		return salida;
	}
	
	
}
