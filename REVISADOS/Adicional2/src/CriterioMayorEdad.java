
public class CriterioMayorEdad extends Criterio {
    int edad;
 
    public CriterioMayorEdad(int e) {
    	edad = e;
    }
	public boolean cumple(Paciente p) {
	   return p.getEdad() > edad;
	}

}
