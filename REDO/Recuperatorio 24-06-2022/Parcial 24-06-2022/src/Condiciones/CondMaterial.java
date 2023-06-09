package Condiciones;

import Estructura.Autoparte;

public class CondMaterial {

    private String material;

    public CondMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean cumple(Autoparte ap){
        return ap.contiene(this.material);
    }
}
