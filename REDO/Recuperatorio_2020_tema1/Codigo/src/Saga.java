import java.util.ArrayList;
import java.util.HashSet;

public class Saga extends ElementoAudiovisual{

    private ArrayList<ElementoAudiovisual> elementos;

    public Saga(String titulo) {
        super(titulo);
    }

    private Saga(String titulo, ArrayList<ElementoAudiovisual> elementos){
        super(titulo);
        this.elementos.addAll(elementos);
    }

    public void addElemento(ElementoAudiovisual e){
        this.elementos.add(e);
    }

    public void removeElemento(ElementoAudiovisual e){
        this.elementos.remove(e);
    }

    @Override
    public int getCantOscars() {
        int oscars = 0;

        for(int i = 0; i < elementos.size(); i++){
            oscars += elementos.get(i).getCantOscars();
        }
        return oscars;
    }

    @Override
    public ArrayList<Actor> getActores() {

        //hashSet usado para evitar la repeticion de actores
        HashSet<Actor> aux = new HashSet<>();
        ArrayList<Actor> salida = new ArrayList<>();

        for(int i = 0; i < elementos.size(); i++){
            ElementoAudiovisual elemI = elementos.get(i);
            aux.addAll(elemI.getActores());
        }

        salida.addAll(aux);

        return salida;
    }

    @Override
    public double getPuntaje() {
        int suma = 0;

        for(int i = 0; i < elementos.size(); i++){
            suma += elementos.get(i).getPuntaje();
        }


        return (double) suma /elementos.size();
    }

    @Override
    public ArrayList<ElementoAudiovisual> getCopia(Condicion c) {

        ArrayList<ElementoAudiovisual> salida = new ArrayList<>();

        if(c.cumple(this)){
            Saga copia = new Saga(getTitulo(), elementos);
            salida.add(copia);
        }

        return salida;
    }

    @Override
    public ArrayList<Pelicula> getPelis(Condicion c) {
        ArrayList<Pelicula> salida = new ArrayList<>();

        for(int i = 0; i < elementos.size(); i++){

            salida.addAll(elementos.get(i).getPelis(c));
        }

        return salida;
    }
}
