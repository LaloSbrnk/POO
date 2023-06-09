public class CondOr extends Condicion{

    private Condicion c1;
    private Condicion c2;

    public CondOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoTienda e) {
        return c1.cumple(e) || c2.cumple(e);
    }
}
