public class CondNot extends Condicion{

    private Condicion c1;

    public CondNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(ElementoAudiovisual e) {
        return !c1.cumple(e);
    }
}
