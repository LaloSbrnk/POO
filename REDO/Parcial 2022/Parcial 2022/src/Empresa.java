import java.util.ArrayList;

public class Empresa {

    private ArrayList<ElementosAlquiler> elementos;

    public Empresa() {
        this.elementos = new ArrayList<>();
    }

    public ArrayList<ElementosAlquiler> listarElementos(Condicion c){
        ArrayList<ElementosAlquiler> result = new ArrayList();

        for(int i = 0; i < elementos.size(); i++){
            ElementosAlquiler elemI = elementos.get(i);

            result.addAll(elemI.listar(c));
        }

        return result;
    }

    public static void main(String[] args) {

    }
}