public class CondDescr extends Condicion{

   private String palabra;

    @Override
    public boolean cumple(ElementosAlquiler e) {
        return e.getDescripcion().contains(palabra);
    }
}
