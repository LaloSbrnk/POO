package ejercicio1;

import java.util.ArrayList;

public abstract class Expresion {

	public static final double ERROR = -23;
	
	public abstract double getValor();
	
	public abstract ArrayList<Double> getListadNumeros();
	public abstract ArrayList<String> getOps();
}
