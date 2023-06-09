package ejercicio1;

import java.util.ArrayList;

public class Suma extends OpBinaria {

	
	
	public double getValor() {
		
		return e1.getValor() + e2.getValor();
	}
	
	
	public Suma(Expresion e1, Expresion e2) {
		super(e1,e2,"+");
		
	}



}
