public class CondActor extends Condicion{

    private Actor actor;

    public CondActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(ElementoAudiovisual e) {
        return e.getActores().equals(actor);
    }
}
