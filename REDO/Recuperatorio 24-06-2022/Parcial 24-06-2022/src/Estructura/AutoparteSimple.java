package Estructura;

import CalculadorPrecio.Calculadora;
import Condiciones.*;
import java.util.ArrayList;

public class AutoparteSimple extends Autoparte{

    protected ArrayList<String> materiales;
    private int peso;
    protected double huellaCarbono;

    private Calculadora calculadora;

    public AutoparteSimple(int id, String marca, int peso, double huellaCarbono, Calculadora c) {
        super(id, marca);
        this.peso = peso;
        this.huellaCarbono = huellaCarbono;
        this.materiales = new ArrayList<>();
        this.calculadora = c;
    }

    public int getPeso(){return this.peso;}

    public void setPeso(int p){this.peso = p;}

    public double getHuellaCarbono(){return this.huellaCarbono;}

    public void setHuellaCarbono(double hc){this.huellaCarbono = hc;}

    public void addMaterial(String m){
        if( !materiales.contains(m) )
            this.materiales.add(m);
    }

    public void removeMAterial(String m){
        this.materiales.remove(m);
    }

    public ArrayList<String> getMateriales(){
        return new ArrayList<>(this.materiales);
    }

    public boolean contiene(String m){
        return this.materiales.contains(m);
    }

    public double getCosto(){

        return calculadora.getCosto(this);
    }

}
