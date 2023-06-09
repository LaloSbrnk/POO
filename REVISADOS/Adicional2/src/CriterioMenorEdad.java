
public class CriterioMenorEdad extends Criterio {
    int edad;
 
    public CriterioMenorEdad(int e) {
    	edad = e;
    }
	public boolean cumple(Paciente p) {
	   return p.getEdad() < edad;
	}

}