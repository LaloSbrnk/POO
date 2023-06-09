package Filtros;

import Estructura.Elemento;
import Estructura.Noticia;

public class CondAutor implements Condicion{

    private String autor;

    public CondAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean cumple(Noticia n){
        return n.getAutor().equals(this.autor);
    }
}
