package CalculadorPrecio;

import Condiciones.Condicion;
import Estructura.Autoparte;

public abstract class Calculadora {

    protected Condicion cc;


    public Calculadora(Condicion c1) {
        this.cc = c1;
    }

    public Condicion getC1() {
        return cc;
    }

    public void setC1(Condicion c1) {
        this.cc = c1;
    }

    public double getCosto(Autoparte ap){

        if( cc.cumple(ap) )
            return this.calcularCosto(ap);
        else
            return 0;
    }

    public abstract double calcularCosto(Autoparte ap);
}
