import java.util.ArrayList;

public abstract class ElementoTienda {

    private String nombre;

    public ElementoTienda(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getPeso();
    public abstract int getVolumen();
    public abstract String getMarca();
    public abstract ArrayList<String> getCaract();
    public abstract double getPrecio();
    public abstract int getCant();
    public abstract ArrayList<ElementoTienda> buscar(Condicion c);
    public abstract boolean tieneCaract(String c);
    public abstract ArrayList<ElementoTienda> getCopia(Condicion c);

    @Override
    public boolean equals(Object obj) {

        return this.nombre.equals(((ElementoTienda) obj).getNombre());
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
