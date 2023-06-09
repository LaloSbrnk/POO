package Condiciones;

import Estructura.Autoparte;

public class CondMarca extends Condicion{

    private String marca;

    public CondMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean cumple(Autoparte ap){
        return ap.getMarca().equals(this.marca);
    }
}
