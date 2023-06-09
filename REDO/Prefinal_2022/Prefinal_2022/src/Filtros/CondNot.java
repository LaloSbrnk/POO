package Filtros;

import Estructura.Elemento;
import Estructura.Noticia;

public class CondNot implements Condicion{

    private Condicion c1;

    public CondNot(Condicion c1) {
        this.c1 = c1;
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    public boolean cumple(Noticia n){
        return !c1.cumple(n);
    }
}
