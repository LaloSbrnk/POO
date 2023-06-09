import java.util.ArrayList;

public class Cama extends ElementoSIS {

	protected ArrayList<String> caracteristicas;
	protected Criterio condicionAceptacion;

	Paciente p1;

	public Cama(Criterio c1) {
		condicionAceptacion = c1;
		caracteristicas = new ArrayList<String>();
	}

	public void addCaracteristica(String carac) {
		if (!caracteristicas.contains(carac))
			caracteristicas.add(carac);
	}

	public void removeCaracteristica(String carac) {

		caracteristicas.remove(carac);
	}

	public boolean tieneCaracteristica(String car) {
		return caracteristicas.contains(car);
	}

	public boolean estaOcupada() {
		return p1 != null;
	}

	public Criterio getCondicionAceptacion() {
		return condicionAceptacion;
	}

	public void setCondicionAceptacion(Criterio condicionAceptacion) {
		this.condicionAceptacion = condicionAceptacion;
	}

	public Paciente getPaciente() {
		return p1;
	}

	public void setPaciente(Paciente p1) {
		this.p1 = p1;
	}

	public void liberarCama() {
		p1 = null;
	}

	public ArrayList<Cama> buscarCamas(Paciente p) {
		ArrayList<Cama> salida = new ArrayList<Cama>();
		if (!estaOcupada() && condicionAceptacion.cumple(p))
			salida.add(this);
		return salida;
	}

	public int getTotalCamas() {
		return 1;
	}
	
	public ElementoSIS getCopia(Criterio c) {
		
		if (estaOcupada()&& c.cumple(p1)) {
			return  this.getCopia();
			
		} else {
     		return null;
		}
	}

	public ElementoSIS getCopiaVacia() {
		Cama c1=  (Cama)this.getCopia();
		c1.liberarCama();
		return c1;
	}
	
	
	public ElementoSIS getCopia() {
		Cama c1=  new Cama(condicionAceptacion);
		c1.setPaciente(p1);
		for(int i =0; i< caracteristicas.size();i++) {
			c1.addCaracteristica(caracteristicas.get(i));
		}
		return c1;
	}
	
}
