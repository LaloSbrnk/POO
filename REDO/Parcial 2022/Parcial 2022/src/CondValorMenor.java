public class CondValorMenor extends Condicion{

    private double valor;

    public CondValorMenor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean cumple(ElementosAlquiler e) {
        return e.getValor() < this.valor;
    }
}
