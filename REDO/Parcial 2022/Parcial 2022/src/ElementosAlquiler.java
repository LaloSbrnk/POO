import java.util.ArrayList;

public abstract class ElementosAlquiler {

    private int id;


    public ElementosAlquiler(int id) {
        this.id = id;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double getValor();
    public abstract int getAntiguedad();

    public abstract String getDescripcion();
    public abstract ArrayList<ElementosAlquiler> listar(Condicion c);
}
