package Condiciones;

import Estructura.Autoparte;

public class CondAnd extends Condicion{

    private Condicion c1;
    private Condicion c2;

    public CondAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Autoparte ap){
        return c1.cumple(ap) && c2.cumple(ap);
    }
}
