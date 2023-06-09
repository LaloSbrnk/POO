import java.util.ArrayList;

public class CondMasDeXActores extends Condicion{

    private int cantActores;

    public CondMasDeXActores(int cantActores) {
        this.cantActores = cantActores;
    }

    @Override
    public boolean cumple(ElementoAudiovisual e) {

        ArrayList<Actor> aux = e.getActores();
        return aux.size() > cantActores;
    }
}
