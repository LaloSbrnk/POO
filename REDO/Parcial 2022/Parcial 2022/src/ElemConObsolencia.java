import java.util.ArrayList;

public class ElemConObsolencia extends ElementosAlquiler{

    private int obsolenciaEn;

    private ElementosAlquiler contenido;

    private static int descuento = 2; //en %

    public ElemConObsolencia(int id, int obsolenciaEn, ElementosAlquiler contenido) {
        super(id);
        this.obsolenciaEn = obsolenciaEn;
        this.contenido = contenido;
    }

    public int getObsolenciaEn() {
        return obsolenciaEn;
    }

    public void setObsolenciaEn(int obsolenciaEn) {
        this.obsolenciaEn = obsolenciaEn;
    }

    public static int getDescuento() {
        return descuento;
    }

    public static void setDescuento(int descuento) {
        ElemConObsolencia.descuento = descuento;
    }

    public boolean estaObsoleto(){
        return contenido.getAntiguedad() > this.obsolenciaEn;
    }

    @Override
    public int getAntiguedad() {
        return contenido.getAntiguedad();
    }

    @Override
    public double getValor() {
        if( !this.estaObsoleto())
            return contenido.getValor();
        else
            return contenido.getValor() * ((double) (100 - descuento) /100);
    }

    @Override
    public String getDescripcion() {
        return contenido.getDescripcion();
    }

    @Override
    public ArrayList<ElementosAlquiler> listar(Condicion c) {

        return this.contenido.listar(c);
    }
}
