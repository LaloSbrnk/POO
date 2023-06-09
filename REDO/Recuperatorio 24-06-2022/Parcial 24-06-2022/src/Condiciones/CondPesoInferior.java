package Condiciones;

import Estructura.Autoparte;

public class CondPesoInferior extends Condicion{

    private int peso;

    public CondPesoInferior(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean cumple(Autoparte ap){
        return ap.getPeso() < this.peso;
    }
}
