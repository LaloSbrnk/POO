
public class CriterioEquipamiento extends Criterio {

	String equipo;
	
	public CriterioEquipamiento(String e) {
		equipo = e;
	}

	public boolean cumple(Paciente p) {
		return p.requiereEquipamiento(equipo);
	}

}
