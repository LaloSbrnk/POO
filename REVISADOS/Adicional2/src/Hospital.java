import java.util.ArrayList;

public class Hospital {

	ArrayList<ElementoSIS> elemns;
	ElementoSIS principal;
	ArrayList<Paciente> pacientes;
	
	
	
	public ArrayList<Cama> buscar(Paciente p){
		return principal.buscarCamas(p);
		
	
	}
	
	public boolean asignarCama(Paciente p) {
		
		ArrayList<Cama> camas = principal.buscarCamas(p);
		
		if(camas.size()>0) {
           camas.get(0).setPaciente(p);	
           pacientes.add(p);
           return true;
		}else {
			return false;
		}
	}
	
	public int cantidadPacientes() {
		return pacientes.size();
	}
}
