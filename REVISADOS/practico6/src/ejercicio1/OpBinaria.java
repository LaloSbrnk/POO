package ejercicio1;

import java.util.ArrayList;

public abstract  class OpBinaria extends Expresion {
	protected Expresion e1;
	protected Expresion e2;
	
	String miSimbolo;
	
	public OpBinaria (Expresion e1, Expresion e2,String sim) {
		this.e1=e1;
		this.e2=e2;
		miSimbolo = sim;
	}
	
	


	public ArrayList<Double> getListadNumeros(){
		ArrayList<Double> ns = new ArrayList<Double>();
		
		ns.addAll(e1.getListadNumeros());

	    ns.addAll(e2.getListadNumeros());

		
		return ns;
	}

	
	public ArrayList<String> getOps(){
		ArrayList<String> ops = new ArrayList<String>();
		ops.addAll(e1.getOps());
		ops.add(miSimbolo);
		ops.addAll(e2.getOps());
		return ops;
	}
	
	public String toString() {
		return "(" + e1.toString() + miSimbolo + e2.toString() + ")";
	}
	
}
