package Filtros;

import Estructura.Noticia;

public class CondPalClave implements Condicion{

    private  String palabra;

    public CondPalClave(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Noticia n){
        return n.getPalClaves().contains(palabra);
    }
}
