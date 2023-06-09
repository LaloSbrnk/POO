import java.util.ArrayList;

public class Producto extends ElementoTienda{

    private int volumen; //en cm cubicos
    private int peso; //en gramos
    private double precio;
    private String marca;
    private ArrayList<String> caract; //Caraacteristicas del producto

    public Producto(String nombre, int volumen, int peso, double precio, String marca) {
        super(nombre);
        this.volumen = volumen;
        this.peso = peso;
        this.precio = precio;
        this.marca = marca;
        this.caract = new ArrayList<>();
    }

    public Producto(String nombre, int volumen, int peso, double precio, String marca, ArrayList<String> caract) {
        this(nombre, volumen,peso, precio, marca);

        for(int i = 0; i < caract.size(); i++){
            this.caract.add(caract.get(i));
        }


    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void addCaract(String c){
        caract.add(c);
    }

    public void removeCaract(String c){
        caract.remove(c);
    }

    @Override
    public ArrayList<String> getCaract() {
        ArrayList<String> result = new ArrayList<>();

        result.addAll(this.caract);

        return result;
    }

    @Override
    public int getCant() {
        return 1;
    }

    @Override
    public ArrayList<ElementoTienda> buscar(Condicion c) {
        ArrayList<ElementoTienda> salida = new ArrayList<>();

        if(c.cumple(this))
            salida.add(this);

        return salida;
    }

    @Override
    public boolean tieneCaract(String c) {

        for(int i = 0; i < this.caract.size(); i++){

            if(caract.get(i).equals(c))
                return true;
        }

        return false;
    }

    @Override
    public ArrayList<ElementoTienda> getCopia(Condicion c) {
        ArrayList<ElementoTienda> salida = new ArrayList<>();


        if(c.cumple(this)){
            Producto copia = new Producto(getNombre(), this.volumen, this.peso, this.precio,
                                this.marca, this.caract);

            salida.add(copia);
        }

        return salida;
    }
}
