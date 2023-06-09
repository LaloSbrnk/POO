import java.util.ArrayList;

public class Kit extends ElementoLibreria{
    
	
	private ArrayList<ElementoLibreria> elementos;

	
	public Kit(String n) {
		super(n);
		elementos = new ArrayList<ElementoLibreria>();
	}
	public void addElemento(ElementoLibreria p) {
	  if (! elementos.contains(p)) {	// ESTE EJERCICIO NO LO PEDIA
		elementos.add(p);
	  }	
	}

	
	

	
	public double getPrecio() {
		
		double suma =0;
		
		for (int i=0;i<elementos.size();i++) {
			suma = suma + elementos.get(i).getPrecio();
		}
		
		return suma;
	}
	
	public double getVolumen() {
		double mayor =0;
		for (int i=0;i<elementos.size();i++) {
			double voli=  elementos.get(i).getVolumen();
			if (voli > mayor) {
				mayor = voli;
			}
		}
		return mayor;
	}
	
	
	public String getMarca() {

        if (elementos.size()>0) {
        	return elementos.get(0).getMarca();
        } else {
        	return null;
        }
        
		
	}
	
	
	public int cantidadProductos() {
		int suma =0;
		
		for (int i =0; i< elementos.size();i++) {
			
			ElementoLibreria eli = elementos.get(i);
			
			suma = suma + eli.cantidadProductos();
				
			
		}
		return suma;
		
	}
	
	
	public ArrayList<ElementoLibreria> buscar(Filtro condicion){
		ArrayList<ElementoLibreria> salida = new ArrayList<ElementoLibreria>();
		
		if (condicion.cumple(this)) {
			salida.add(this);
		}
		
		for(int i =0; i<elementos.size();i++) {
			ElementoLibreria eli = elementos.get(i);
            salida.addAll(eli.buscar(condicion));
		}
		
		return salida;
	}
	
}
