public class Computadora extends Dispositivo implements Comparable<Computadora>{
    private String nombre;
    private int velocidad;

    public Computadora(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void ejecutarProceso (Proceso p){

    }

    @Override
    public int compareTo(Computadora otro) {
        return this.getVelocidad() - otro.getVelocidad();
    }
}
