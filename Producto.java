package ejercicio1;

public class Producto extends OpBinaria {

	public Producto(Expresion e1,Expresion e2) {
		super(e1,e2,"*");
	}
	@Override
	public double getValor() {
		
		return e1.getValor() * e2.getValor();
	}

}
