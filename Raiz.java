package ejercicio1;

public class Raiz extends OpBinaria {

	public Raiz(Expresion e1, Expresion e2) {
		super(e1,e2,"~");
	}
	public double getValor() {
		double v1 = e1.getValor();
		double v2 = e2.getValor();
		if (v2>0)
			return Math.pow(v1,1/v2);
		else 
			return ERROR;
	}

}
