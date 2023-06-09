import java.util.ArrayList;

public class CamaEspecial extends Cama {

	public CamaEspecial() {
		super(null);
	}
	
	public ArrayList<Cama> buscarCamas(Paciente p) {
		ArrayList<Cama> salida = new ArrayList<Cama>();
		if (!estaOcupada())
			salida.add(this);
		return salida;
	}
	
	public ElementoSIS getCopia() {
		CamaEspecial c1=  new CamaEspecial();
		c1.setPaciente(p1);
		for(int i =0; i< caracteristicas.size();i++) {
			c1.addCaracteristica(caracteristicas.get(i));
		}
		return c1;
	}

	
}
