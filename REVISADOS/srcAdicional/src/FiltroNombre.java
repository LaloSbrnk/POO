
public class FiltroNombre implements Filtro {

	private String marcaBuscada;
	@Override
	public boolean cumple(ElementoLibreria el) {
		// TODO Auto-generated method stub
		return el.getMarca().equals(el);
	}

}
