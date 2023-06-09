package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends EFS {

    private ArrayList<EFS> elementos;
   
    
    
	
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		elementos = new ArrayList<EFS>();
	}

	public void addElemento(EFS ee) {
		
		if (!elementos.contains(ee))
		   elementos.add(ee);
	}

	public void deleteElemento(EFS ee) {
		elementos.remove(ee);//EQUALS
	}


	public double getTamano() {
	  double suma = 0;
	  
	  for(int i =0;i <elementos.size();i++) {
		  EFS elemI = elementos.get(i);
		  suma = suma + elemI.getTamano();
	  }
	  return suma;
	}

	
	public int getCantidad() {
		int suma = 0;
		
		for (int i =0; i <elementos.size(); i++) {
			EFS  eei = elementos.get(i);
			suma = suma + eei.getCantidad();
		}
		return suma;
	}
}


//IF POR TIPOS  ESTA MAAAALLL
/*			if (eei es un archivo ) {
			suma = suma + 1;
		} else {
			if (eei es un directorio) {
               int cant = ((Directorio)eei).getCantidad();
               suma = suma + cantidad;
			}
		} */
