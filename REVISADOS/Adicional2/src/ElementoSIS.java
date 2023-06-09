import java.util.ArrayList;

public abstract class ElementoSIS {

	
	public abstract ArrayList<Cama> buscarCamas(Paciente p);
	public abstract int getTotalCamas();
	public abstract ElementoSIS  getCopia(Criterio c);
	
	// obtener una copia de la estructura VAcia
	public abstract ElementoSIS getCopiaVacia();
	
	//(/ OBTENER UNA COPIA EN PROFUNDIDAD)
	public abstract ElementoSIS getCopia();
}
