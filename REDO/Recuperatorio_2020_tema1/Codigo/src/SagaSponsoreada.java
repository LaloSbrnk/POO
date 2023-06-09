import java.util.ArrayList;

public class SagaSponsoreada extends Saga{

    private Pelicula peliPredefinida;

    public SagaSponsoreada(String titulo, Pelicula peliDefinida) {
        super(titulo);
        this.peliPredefinida = peliDefinida;
    }

    @Override
    public ArrayList<Pelicula> getPelis(Condicion c) {
        ArrayList<Pelicula> salida = super.getPelis(c);

        salida.add(this.peliPredefinida);
        return salida;
    }
}
