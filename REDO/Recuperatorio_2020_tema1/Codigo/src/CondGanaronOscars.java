public class CondGanaronOscars extends Condicion{

    @Override
    public boolean cumple(ElementoAudiovisual e) {
        return e.getCantOscars() > 0;
    }
}
