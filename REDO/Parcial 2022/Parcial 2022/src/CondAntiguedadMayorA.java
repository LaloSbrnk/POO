public class CondAntiguedadMayorA extends Condicion{

    private int antiguedad;

    public CondAntiguedadMayorA(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public boolean cumple(ElementosAlquiler e) {
        return e.getAntiguedad() > this.antiguedad;
    }
}
