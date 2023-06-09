package ejercicio1;

public class Potencia extends OpBinaria {

	
	public Potencia(Expresion e1,Expresion e2) {
		super(e1,e2,"°");
	}
	@Override
	public double getValor() {
		
		return Math.pow(e1.getValor(),e2.getValor());
	}

}
