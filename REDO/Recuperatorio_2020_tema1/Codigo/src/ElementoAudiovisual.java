import java.util.ArrayList;

public abstract class ElementoAudiovisual {

    private String titulo;

    public ElementoAudiovisual(String titulo) {
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract int getCantOscars();
    public abstract ArrayList<Actor> getActores();
    public abstract double getPuntaje();
    public abstract ArrayList<ElementoAudiovisual> getCopia(Condicion c);
    public abstract ArrayList<Pelicula> getPelis(Condicion c);

}
