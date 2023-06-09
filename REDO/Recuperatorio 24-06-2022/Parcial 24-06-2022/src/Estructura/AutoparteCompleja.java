package Estructura;

import CalculadorPrecio.Calculadora;
import Condiciones.*;
public class AutoparteCompleja extends AutoparteSimple{

    public AutoparteCompleja(int id, String marca, int peso, double huellaCarbono, Calculadora c){
        super(id, marca, peso, huellaCarbono, c);
    }

    public double getHuellaCarbono(){
        return (this.huellaCarbono + this.getPeso()) / this.materiales.size();
    }


}
