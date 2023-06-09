import java.util.ArrayList;


public class Libreria {

	Filtro publicidad;
	
	ArrayList<ElementoLibreria> productos;
	
	public void setPolitica(Filtro pol) {
		publicidad = pol;
	}
	
	
	public boolean sePublicita(ElementoLibreria el) {
		return publicidad.cumple(el);
	}
	
	public ArrayList<ElementoLibreria> buscar(Filtro condicion){
		ArrayList<ElementoLibreria> salida = new ArrayList<ElementoLibreria>();
		
		for(int i = 0; i<productos.size(); i++) {
			ElementoLibreria eli = productos.get(i);

			salida.addAll( eli.buscar(condicion));
		}
		return salida;
		
		
		
	}
}
