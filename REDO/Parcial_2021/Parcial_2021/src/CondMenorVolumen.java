public class CondMenorVolumen extends Condicion{

    private int vol;

    public CondMenorVolumen(int vol) {
        this.vol = vol;
    }

    @Override
    public boolean cumple(ElementoTienda e) {
        return e.getVolumen() < vol;
    }
}
