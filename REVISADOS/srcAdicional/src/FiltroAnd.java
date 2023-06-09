
public class FiltroAnd implements Filtro {

	Filtro f1;
	Filtro f2;
	@Override
	public boolean cumple(ElementoLibreria el) {
		// TODO Auto-generated method stub
		return f1.cumple(el)&&f2.cumple(el);
	}

}
