package Estructura;

import Filtros.Condicion;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CompletionException;

public class Noticia extends Elemento{

    private String titulo;
    private String texto;
    private String autor;
    private String tema;
    private ArrayList<String> palClaves;
    private ArrayList<Comentario> coments;

    public Noticia(String titulo, String texto, String autor, String tema) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.tema = tema;
        this.palClaves = new ArrayList<>();
        this.coments = new ArrayList<>();
    }

    private Noticia(String titulo, String texto, String autor, String tema, ArrayList<Comentario> coments,
                   ArrayList<String> palClaves){
        this(titulo, texto, autor, tema);
        this.palClaves = new ArrayList<>(palClaves);
        this.coments = new ArrayList<>(coments);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void addComent(Comentario c){
        if(!coments.contains(c))
            this.coments.add(c);
    }

    public void removeComent(Comentario c){
        this.coments.remove(c);
    }

    public void addPalClave(String p){
        if(!this.palClaves.contains(p))
            this.palClaves.add(p);
    }

    public void removePalClave(String p){
        this.palClaves.remove(p);
    }

    public String getPalClaves(){
        String salida = new String();

        for(int i=0; i<palClaves.size(); i++){
            salida = salida + palClaves.get(i);
        }

        return salida;
    }

    public Elemento getCopia(Condicion cc){
        Elemento salida = null;

        if(cc.cumple(this)){
            salida = new Noticia(titulo, texto, autor, tema, coments, palClaves);
        }

        return salida;
    }

    public int getCantNoticias(Condicion cc){
        if(cc.cumple(this))
            return 1;

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Noticia noticia = (Noticia) o;
        return Objects.equals(titulo, noticia.titulo) && Objects.equals(texto, noticia.texto) && Objects.equals(autor, noticia.autor) && Objects.equals(tema, noticia.tema) && Objects.equals(palClaves, noticia.palClaves) && Objects.equals(coments, noticia.coments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, texto, autor, tema, palClaves, coments);
    }
}
