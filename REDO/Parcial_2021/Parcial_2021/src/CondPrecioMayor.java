public class CondPrecioMayor extends Condicion{

    private double precio;

    public CondPrecioMayor(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(ElementoTienda e) {
        return e.getPrecio() > this.precio;
    }
}
