import java.util.ArrayList;

public class Combo extends ElementosAlquiler{

    private ArrayList<ElementosAlquiler> elementos;

    public Combo(int id) {
        super(id);
        this.elementos = new ArrayList<>();
    }


    public void addElemento(ElementosAlquiler e){
        this.elementos.add(e);
    }

    public void removeElemento(ElementosAlquiler e){
        this.elementos.remove(e);
    }


    @Override
    public double getValor() {
        double result = 0;

        for(int i = 0; i < elementos.size(); i++){
            ElementosAlquiler elemI = elementos.get(i);

            result =+ elemI.getValor();
        }

        return result;
    }

    @Override
    public int getAntiguedad() {
        int result = 0;

        for( int i = 0; i < elementos.size(); i++){
            int elemI = elementos.get(i).getAntiguedad();

            if( elemI > result)
                result = elemI;
        }

        return result;

    }

    @Override
    public String getDescripcion() {
        return null;
    }

    @Override
    public ArrayList<ElementosAlquiler> listar(Condicion c) {
        ArrayList<ElementosAlquiler> result = new ArrayList<>();

        for(int i = 0; i < elementos.size(); i++){
            ElementosAlquiler elemI = elementos.get(i);

            result.addAll(elemI.listar(c));
        }

        return result;
    }
}
