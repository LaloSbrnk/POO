import java.util.ArrayList;
import java.util.HashSet;

public class IMDb {

    private ArrayList<ElementoAudiovisual> elementos;

    public IMDb() {
        this.elementos = new ArrayList<>();
    }

    public int getCantOscars(ElementoAudiovisual e){
        return e.getCantOscars();
    }

    public ArrayList<Actor> getActores(ElementoAudiovisual e){
        return e.getActores();
    }

    public double getPuntaje(ElementoAudiovisual e){
        return e.getPuntaje();
    }

    public ArrayList<Pelicula> getPrelis(Condicion c){

        ArrayList<Pelicula> salida = new ArrayList<>();

        for(int i = 0; i < elementos.size(); i++) {

            salida.addAll(elementos.get(i).getPelis(c));
        }
        return salida;
    }

    public static void main(String[] args) {

    }
}
