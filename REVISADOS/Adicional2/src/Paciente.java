import java.util.ArrayList;

public class Paciente {

	private String nombre;
	private int edad;
	private ArrayList<String> sintomas;
	private ArrayList<String> equip;
	
	public Paciente(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		sintomas = new ArrayList<String>();
		equip = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void addSintoma(String s) {
		if (!sintomas.contains(s))
			sintomas.add(s);
	}
	public void removeSintoma(String s) {
		sintomas.remove(s);
	}
	public boolean tieneSintoma(String s) {
		return sintomas.contains(s);
	}
	
	public void addEquipamiento(String s) {
		if (!equip.contains(s))
			equip.add(s);
	}
	public void removeEquipamiento(String s) {
		equip.remove(s);
	}
	public boolean requiereEquipamiento(String s) {
		return equip.contains(s);
	}
	
}
