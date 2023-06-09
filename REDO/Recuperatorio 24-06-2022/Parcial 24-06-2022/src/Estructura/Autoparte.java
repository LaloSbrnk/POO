package Estructura;
import Condiciones.*;

import java.util.ArrayList;

public abstract class Autoparte {

    private int id;
    private String marca;

    public Autoparte(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public abstract int getPeso();
    public abstract double getHuellaCarbono();
    public abstract ArrayList<String> getMateriales();
    public int getCant(Condicion cc){
        if( cc.cumple(this)){
            return 1;
        }else{
            return 0;
        }
    }
    public abstract boolean contiene(String material);
    public abstract double getCosto();


    public boolean equals(Object obj){
        return ((Autoparte)obj).getId() == this.id;
    }
}
