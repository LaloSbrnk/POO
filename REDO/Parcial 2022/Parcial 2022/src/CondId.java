public class CondId extends Condicion{

    private int id;

    public CondId(int id) {
        this.id = id;
    }

    @Override
    public boolean cumple(ElementosAlquiler e) {
        return e.getId() == this.id;
    }
}
