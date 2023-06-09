import java.util.ArrayList;
import java.util.HashSet;

public class Combo extends ElementoTienda{

    private ArrayList<ElementoTienda> elementos;

    public Combo(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }


    //CONSTRUCTOR PRIVADO PARA EL METODO COPIA
    private Combo(String nombre, ArrayList<ElementoTienda> elems){
        super(nombre);
        this.elementos = elems;
    }


    public void addElemento(ElementoTienda e){
        if(!elementos.contains(e))
            this.elementos.add(e);
    }

    public void removeElemento(ElementoTienda e){
        elementos.remove(e);
    }

    @Override
    public int getPeso() {
        int suma = 0;

        for(int i = 0; i < elementos.size(); i++){
            ElementoTienda elemI = elementos.get(i);
            suma += elemI.getPeso();
        }

        return suma;
    }

    @Override
    public int getVolumen() {

        int mayor = 0;

        for(int i = 0; i < elementos.size(); i++){
            int volI = elementos.get(i).getVolumen();
            if(volI > mayor)
                mayor = volI;
        }

        return mayor;
    }

    @Override
    public String getMarca() {
        return this.elementos.get(0).getMarca();
    }

    @Override
    public ArrayList<String> getCaract() {

        HashSet<String> aux = new HashSet<>();

        for(int i = 0; i < elementos.size(); i++){
            ElementoTienda elemI = elementos.get(i);

            aux.addAll(elemI.getCaract());
        }

        return new ArrayList<String>(aux);
    }

    @Override
    public double getPrecio() {

        int suma = 0;

        for(int i = 0; i < elementos.size(); i++){
            ElementoTienda elemI = elementos.get(i);
            suma += elemI.getPrecio();
        }

        return suma;

    }

    @Override
    public int getCant() {

        int result = 0;

        for(int i = 0; i < elementos.size(); i++){
            ElementoTienda elemI = elementos.get(i);

            result += elemI.getCant();
        }

        return result;
    }

    @Override
    public ArrayList<ElementoTienda> buscar(Condicion c) {
        ArrayList<ElementoTienda> salida = new ArrayList<>();

        if(c.cumple(this))
            salida.add(this);

        for (int i = 0; i < elementos.size(); i++){
            ElementoTienda elemI = elementos.get(i);

            salida.addAll(elemI.buscar(c));

        }

        return salida;
    }

    @Override
    public boolean tieneCaract(String c) {
        ArrayList<String> caracts = new ArrayList<>();

        caracts = getCaract();

        for(int i = 0; i < caracts.size(); i++){
            if(caracts.get(i).equals(c))
                return true;
        }

        return  false;
    }

    public boolean estaVacio(){
        return elementos.size() == 0;
    }

    @Override
    public ArrayList<ElementoTienda> getCopia(Condicion c) {

        ArrayList<ElementoTienda> elementosCopia = new ArrayList<>();
        ArrayList<ElementoTienda> salida = new ArrayList<>();


        for(int i = 0; i < elementos.size(); i++){
            ElementoTienda elemI = elementos.get(i);

            elementosCopia.addAll(elemI.getCopia(c));
        }


        if(!elementosCopia.isEmpty()) {
            ElementoTienda comboCopia = new Combo(getNombre(), elementosCopia);
            salida.add(comboCopia);
        }

        return salida;

    }

}
