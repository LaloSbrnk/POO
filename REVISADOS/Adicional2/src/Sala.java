import java.util.ArrayList;

public class Sala extends ElementoSIS {

	ArrayList<ElementoSIS> elementos;
	
	public Sala() {
		elementos = new ArrayList<ElementoSIS>();
	}
	
	public void addElemento(ElementoSIS el) {
			elementos.add(el);
	}
	
	public ArrayList<Cama> buscarCamas(Paciente p){
		ArrayList<Cama> salida = new ArrayList<Cama>();
		for(int i =0; i< elementos.size(); i++) {
			ElementoSIS eleI = elementos.get(i);
			salida.addAll(eleI.buscarCamas(p));
		}
		return salida;
		
	}
	
	public int getTotalCamas() {
		int suma = 0;
		for(int i =0; i< elementos.size(); i++) {
			ElementoSIS eleI = elementos.get(i);
			suma = suma + eleI.getTotalCamas();
		}
		return suma;
	}
	
	
	public ElementoSIS getCopia(Criterio c) {
		Sala s1 = new Sala();
		boolean encontro = false;
		for (int i = 0; i<elementos.size();i++) {
			ElementoSIS elei = elementos.get(i);
			ElementoSIS copia = elei.getCopia(c);
			if (copia!=null) {
				encontro = true;
				s1.addElemento(copia);
			}
		}
		
		if (encontro) {
			return s1;
		}else {
			return null;
		}
	}
	
	public ElementoSIS getCopiaVacia() {
		Sala s1 = new Sala();
		for (int i = 0; i<elementos.size();i++) {
			ElementoSIS elei = elementos.get(i);
			ElementoSIS copia = elei.getCopiaVacia();
			s1.addElemento(copia);
		}
		return s1;
	}
	
	public ElementoSIS getCopia() {
		Sala s1 = new Sala();
		for (int i = 0; i<elementos.size();i++) {
			ElementoSIS elei = elementos.get(i);
			ElementoSIS copia = elei.getCopia();
			s1.addElemento(copia);
		}
		return s1;
	}
}
