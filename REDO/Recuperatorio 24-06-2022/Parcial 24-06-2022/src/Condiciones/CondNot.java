package Condiciones;

import Estructura.Autoparte;

public class CondNot extends Condicion {

    private Condicion c1;

    public CondNot(Condicion c1) {
        this.c1 = c1;
    }

    public boolean cumple(Autoparte ap) {
        return !c1.cumple(ap);
    }
}
