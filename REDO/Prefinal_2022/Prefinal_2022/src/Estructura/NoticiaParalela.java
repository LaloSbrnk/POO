package Estructura;

import Filtros.Condicion;

public class NoticiaParalela extends Noticia{

    private Noticia noticiaAsociada;

    public NoticiaParalela(String titulo, String texto, String autor, String tema, Noticia noticiaAsociada) {
        super(titulo, texto, autor, tema);
        this.noticiaAsociada = noticiaAsociada;
    }

    public Noticia getNoticiaAsociada() {
        return noticiaAsociada;
    }

    public void setNoticiaAsociada(Noticia noticiaAsociada) {
        this.noticiaAsociada = noticiaAsociada;
    }

    public void addComent(Comentario c){
        super.addComent(c);
        this.noticiaAsociada.addComent(c);
    }

    public Elemento getCopia(Condicion cc){
        return this.noticiaAsociada.getCopia(cc);
    }
}

