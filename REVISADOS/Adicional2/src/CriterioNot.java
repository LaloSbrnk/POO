
public class CriterioNot extends Criterio {

	Criterio origen;
	
	public CriterioNot(Criterio o) {
		origen = o;
	}
	
	public boolean cumple(Paciente p) {
		return ! origen.cumple(p);
	}

}
