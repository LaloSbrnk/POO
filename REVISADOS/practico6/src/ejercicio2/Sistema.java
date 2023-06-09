package ejercicio2;

public class Sistema {

	public static void main(String[] args) {


		Archivo a1 = new Archivo("a1",null,null,10);
		Archivo a2 = new Archivo("a2",null,null,10);
		Archivo a3 = new Archivo("a3",null,null,10);
		Archivo a4 = new Archivo("a4",null,null,10);
		
		Directorio d1 = new Directorio("d1",null);
		Directorio d2 = new Directorio("d2",null);
		
		
		d2.addElemento(a3);
		d2.addElemento(a4);
		d2.addElemento(d1);
		d1.addElemento(a1);
		d1.addElemento(a2);
		Link l1 = new Link("Juan",null,a1);
		d2.addElemento(l1);
		
		Zip zz = new Zip("Zip", null, 100);
		zz.addElemento(a1);
		zz.addElemento(a2);
		zz.addElemento(a3);
		zz.addElemento(a4);
		zz.addElemento(d2);
		//d2.addElemento(zz);
		
		
		a1.setTamano(10000);
		System.out.println(d2.getTamano());
		System.out.println(d2.getCantidad());
		
		System.out.println(zz.getTamano());
		System.out.println(zz.getCantidad());
		
	}

}
