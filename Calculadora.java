package ejercicio1

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numero n1 = new Numero(23);
		Numero n2 = new Numero(46);
		Resta r1 = new Resta(n1,n2);
		Numero n3 = new Numero (34);
		
		Suma s1 = new Suma(r1,r1);
		Producto p1 = new Producto(new Numero(30), s1);
		
		Potencia p2 = new Potencia(p1, new Numero(2));
		System.out.println(s1.getValor());
		
		System.out.println(s1.getListadNumeros());
		
		System.out.println(s1.getOps());
		
		System.out.println(s1);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
