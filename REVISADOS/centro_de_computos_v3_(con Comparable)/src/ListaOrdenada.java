import java.util.ArrayList;

public class ListaOrdenada {

    private ArrayList<Comparable> elementos;

    public ListaOrdenada() {
        elementos = new ArrayList();
    }

    public void agregar(Comparable elemento){
        int pos = 0;
        while (pos<elementos.size() &&
                elementos.get(pos).compareTo(elemento)<0)
            pos++;
        if (pos == elementos.size())
            elementos.add(elemento);
        else elementos.add(pos, elemento);
    }

    public Comparable siguiente(){
        if (!vacia())
            return elementos.remove(0);
        else return null;
    }

    public boolean vacia(){
        return elementos.isEmpty();
    }
}
