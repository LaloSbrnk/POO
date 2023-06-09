public class CondCaract extends Condicion{

    private String caract;

    public CondCaract(String caract) {
        this.caract = caract;
    }

    @Override
    public boolean cumple(ElementoTienda e) {
        return e.tieneCaract(caract);
    }
}
