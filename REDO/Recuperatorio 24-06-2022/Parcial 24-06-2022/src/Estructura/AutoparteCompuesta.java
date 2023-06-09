package Estructura;

import Condiciones.*;

import java.util.ArrayList;
import java.util.HashSet;

public class AutoparteCompuesta extends Autoparte{

    private ArrayList<Autoparte> autopartes;

    public AutoparteCompuesta(int id, String marca) {
        super(id, marca);
        this.autopartes = new ArrayList<>();
    }

    public boolean addAutoparte(Autoparte ap, Condicion cc){
        if( (cc.cumple(ap)) && (!autopartes.contains(ap)) ) {
            autopartes.add(ap);
            return true;
        }else {
            return false;
        }
    }

    public void removeAutoparte(Autoparte ap){ this.autopartes.remove(ap);}

    public int getPeso(){
        int suma = 0;

        for(int i=0; i<autopartes.size(); i++){
            suma += autopartes.get(i).getPeso();
        }

        return suma;
    }

    public ArrayList<String> getMateriales(){
        HashSet<String> aux = new HashSet<>();

        for(int i=0; i<autopartes.size(); i++){
            aux.addAll(autopartes.get(i).getMateriales());
        }

        return new ArrayList<String>(aux);
    }

    public double getHuellaCarbono(){

        double max1 = 0;
        double max2 = 0;

        for(int i=0; i< autopartes.size(); i++){
            double elemI = autopartes.get(i).getHuellaCarbono();

            if( (elemI > max1) || (elemI > max2) ){
                if(max1 < max2){
                    max1 = elemI;
                }else{
                    max2 = elemI;
                }
            }
        }

        return max1+max2;
    }

    public int getCant(Condicion cc){

        int salida = super.getCant(cc);

        if (salida == 0){

            for(int i=0; i<autopartes.size(); i++){
                salida += autopartes.get(i).getCant(cc);
            }
        }

        return salida;
    }

    public boolean contiene(String m){

        for(int i =0; i< autopartes.size(); i++){
            if(autopartes.get(i).contiene(m))
                return true;
        }

        return false;
    }


    public double getCosto(){

        int suma = 0;

        for(int i=0; i< autopartes.size(); i++){
            suma += autopartes.get(i).getCosto();
        }

        return suma;
    }

}
