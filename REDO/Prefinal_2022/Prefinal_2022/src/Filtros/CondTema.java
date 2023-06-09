package Filtros;

import Estructura.Noticia;

public class CondTema implements Condicion{

    private String tema;

    public CondTema(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean cumple(Noticia n){
        return n.getTema().equals(this.tema);
    }
}
