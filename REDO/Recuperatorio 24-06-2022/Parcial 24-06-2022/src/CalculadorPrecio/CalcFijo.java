package CalculadorPrecio;

import Condiciones.Condicion;
import Estructura.Autoparte;

public class CalcFijo extends Calculadora{

    private double precio;

    public CalcFijo(Condicion c1, double precio) {
        super(c1);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto(Autoparte ap){return calcularCosto(ap);}

    public double calcularCosto(Autoparte ap){

        return this.precio;
    }
}
