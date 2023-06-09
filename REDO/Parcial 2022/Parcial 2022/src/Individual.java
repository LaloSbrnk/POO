import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Individual extends ElementosAlquiler{

    private double valor;

    private String descripcion;

    private LocalDate fIncorporacion;

    public Individual(int id, double valor, String descripcion, LocalDate fIncorporacion) {
        super(id);
        this.valor = valor;
        this.descripcion = descripcion;
        this.fIncorporacion = fIncorporacion;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getfIncorporacion() {
        return fIncorporacion;
    }

    public void setfIncorporacion(LocalDate fIncorporacion) {
        this.fIncorporacion = fIncorporacion;
    }

    @Override
    public int getAntiguedad() {
        LocalDate hoy = LocalDate.now();

        Period periodo = Period.between(this.fIncorporacion, hoy);

        return periodo.getMonths();
    }

    @Override
    public boolean equals(Object obj) {

        return this.getId() == ((ElementosAlquiler) obj).getId();
    }

    public ArrayList<ElementosAlquiler> listar(Condicion c){
        ArrayList<ElementosAlquiler> result = new ArrayList<>();

        if(c.cumple(this)){
            result.add(this);
        }

        return result;
    }

}

