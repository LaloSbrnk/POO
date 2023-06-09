package CalculadorPrecio;

import Condiciones.Condicion;
import Estructura.Autoparte;

public class CalcSuma extends Calculadora{

    Calculadora calc1;
    Calculadora calc2;

    public CalcSuma(Condicion c1, Calculadora calc1, Calculadora calc2) {
        super(c1);
        this.calc1 = calc1;
        this.calc2 = calc2;
    }

    @Override
    public double calcularCosto(Autoparte ap) {
        return calc1.getCosto(ap) + calc2.getCosto(ap);
    }
}
