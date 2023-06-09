import java.util.ArrayList;

public class TiendaOnline {

    private ArrayList<ElementoTienda> elementos;

    public TiendaOnline() {
        this.elementos = new ArrayList<>();
    }

    private TiendaOnline(ArrayList<ElementoTienda> elementos){
        this.elementos = elementos;
    }


    public void addElemento(ElementoTienda e){
        elementos.add(e);
    }

    public void removeElemento(ElementoTienda e){
        elementos.remove(e);
    }

    public boolean envioGratuito(ElementoTienda e, Condicion c){

        return c.cumple(e);
    }

    public double getPrecio(ElementoTienda e){
        return e.getPrecio();
    }

    public int getCantProductos(Combo c){
        return c.getCant();
    }

    public ArrayList<String> getCaract(ElementoTienda e){
        return e.getCaract();
    }

    public ArrayList<ElementoTienda> buscar(Condicion c){
        ArrayList<ElementoTienda> salida = new ArrayList<>();

        for (int i = 0; i < elementos.size(); i++){
            ElementoTienda elemI = elementos.get(i);

            salida.addAll(elemI.buscar(c));

        }

        return salida;
    }

    public TiendaOnline getCopia(Condicion c){

        ArrayList<ElementoTienda> elemsCopia = new ArrayList<>();

        for(int i = 0; i < elementos.size(); i++){

            elemsCopia.addAll(elementos.get(i).getCopia(c));

        }

        return new TiendaOnline(elemsCopia);

    }
}
