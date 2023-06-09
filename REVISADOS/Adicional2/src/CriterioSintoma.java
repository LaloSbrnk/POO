
public class CriterioSintoma extends Criterio {

	String sintoma;
	
	public CriterioSintoma(String s) {
		sintoma = s;
	}
	
	public boolean cumple(Paciente p) {
		
		return p.tieneSintoma(sintoma);
	}

}
