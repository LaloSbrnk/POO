package ejercicio1;

import java.util.ArrayList;

public class Resta extends OpBinaria {



	
	
	
	public double getValor() {
		
		return e1.getValor()  - e2.getValor();
	}
	
	
	public Resta(Expresion e1, Expresion e2) {
		super(e1,e2,"-");

	}
	


}
