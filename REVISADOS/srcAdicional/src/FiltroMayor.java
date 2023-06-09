
public class FiltroMayor implements Filtro {

	private double pminimo;
	@Override
	public boolean cumple(ElementoLibreria el) {
		// TODO Auto-generated method stub
		return el.getPrecio()>pminimo;
	}

}
