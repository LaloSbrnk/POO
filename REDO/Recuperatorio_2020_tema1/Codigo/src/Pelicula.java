import java.util.ArrayList;

public class Pelicula extends ElementoAudiovisual{

    private double puntaje;
    private int anioLanzamiento;
    private int cantOscars;
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, double puntaje, int anioLanzamiento, int cantOscars) {
        super(titulo);
        this.puntaje = puntaje;
        this.anioLanzamiento = anioLanzamiento;
        this.cantOscars = cantOscars;
        this.actores = new ArrayList<>();
    }

    private Pelicula(String titulo, double puntaje, int anioLanzamiento, int cantOscars, ArrayList<Actor> actores) {
        this(titulo, puntaje, anioLanzamiento, cantOscars);
        this.actores.addAll(actores);
    }

    @Override
    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public int getCantOscars() {
        return cantOscars;
    }

    public void setCantOscars(int cantOscars) {
        this.cantOscars = cantOscars;
    }

    public void addActor(Actor a){
        this.actores.add(a);
    }

    public void removeActor(Actor a){
        this.actores.remove(a);
    }

    @Override
    public ArrayList<Actor> getActores() {
        ArrayList<Actor> salida = new ArrayList<>();

        salida.addAll(this.actores);

        return salida;
    }

    @Override
    public ArrayList<ElementoAudiovisual> getCopia(Condicion c) {
        ArrayList<ElementoAudiovisual> salida = new ArrayList<>();

        if(c.cumple(this)) {
            Pelicula aux = new Pelicula(getTitulo(), getPuntaje(), getAnioLanzamiento(), getCantOscars(), actores);
            salida.add(aux);
        }

        return salida;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.getTitulo().equals(((Pelicula)obj).getTitulo())) &&
                (this.getAnioLanzamiento() == ((Pelicula)obj).anioLanzamiento);
    }

    @Override
    public ArrayList<Pelicula> getPelis(Condicion c) {
        ArrayList<Pelicula> salida = new ArrayList<>();

        if( c.cumple(this) ){
            salida.add(this);
        }

        return salida;
    }
}
