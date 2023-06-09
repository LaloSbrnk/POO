package CalculadorPrecio;

import Condiciones.Condicion;
import Estructura.Autoparte;

public class CalcPorcentaje extends Calculadora{

    private double porcentaje;

    public CalcPorcentaje(Condicion c1, int porcentaje) {

        super(c1);
        this.porcentaje = porcentaje/100;
    }

    public double calcularCosto(Autoparte ap){

         return ap.getPeso()*porcentaje;
    }

}
