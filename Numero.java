package ejercicio1;

import java.util.ArrayList;

public class Numero extends Expresion {

	private double valor;
	
	
	public Numero(double valor) {
		super();
		this.valor = valor;
	}


	public double getValor() {
		
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public ArrayList<Double> getListadNumeros(){
		ArrayList<Double> ns = new ArrayList<Double>();
		ns.add(valor);
		return ns;
	}
	
	public ArrayList<String> getOps(){
		return new ArrayList<String>();
	}
	
	public String toString() {
		return ""+valor;
	}

}
