import java.time.LocalDate;
import java.util.ArrayList;

public class Actor{

    private String nombre;
    private String apellido;
    private LocalDate fNacimiento;
    private ArrayList<Pelicula> peliculas;

    public Actor(String nombre, String apellido, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.peliculas = new ArrayList<Pelicula>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void addPelicula(Pelicula p){
        this.peliculas.add(p);
    }

    public void removePelicula(Pelicula p){
        this.peliculas.remove(p);
    }

    @Override
    public boolean equals(Object obj) {
        return (this.getApellido().equals(((Actor)obj).getApellido()))  &&
                ( this.getNombre().equals(((Actor)obj).getNombre()) );
    }
}
