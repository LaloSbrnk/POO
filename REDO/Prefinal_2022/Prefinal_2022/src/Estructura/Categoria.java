package Estructura;

import Filtros.Condicion;

import java.util.ArrayList;
import java.util.Objects;

public class Categoria extends Elemento{

    private ArrayList<Elemento> elementos;
    private int nroTema;  //Indica que de cual nro de elemento se toma el tema de la Categoria

    public Categoria(int nroTema) {
        this.elementos = new ArrayList<>();
        this.nroTema = nroTema;
    }

    private Categoria(int nroTema, ArrayList<Elemento> elems){
        this(nroTema);
        this.elementos = new ArrayList<>(elems);
    }

    public int getNroTema() {
        return nroTema;
    }

    public void setNroTema(int nroTema) {
        this.nroTema = nroTema;
    }

    public void addElemento(Elemento e){
        if( !elementos.contains(e))
            elementos.add(e);
    }

    public void removeElemento(Elemento e){
        this.elementos.remove(e);
    }

    public String getPalClaves(){
        String salida = new String();

        for(int i = 0; i < elementos.size(); i++){
            salida = salida + elementos.get(i).getPalClaves();
        }

        return salida;
    }

    public String getTema(){

        if(elementos.size() >= this.nroTema)
            return elementos.get(nroTema-1).getTema();
        else
            return null;
    }

    public Elemento getCopia(Condicion cc){

        ArrayList<Elemento> copia = new ArrayList<>();

        for(int i = 0; i < elementos.size(); i++){
            Elemento copiaI = elementos.get(i).getCopia(cc);
            copia.add(copiaI);
        }

        if(copia.size()>0)
            return new Categoria(this.nroTema, copia);
        else
            return null;
    }

    public int getCantNoticias(Condicion cc){
        int suma = 0;

        for(int i = 0; i < elementos.size(); i++){
            suma += elementos.get(i).getCantNoticias(cc);
        }

        return suma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return nroTema == categoria.nroTema && Objects.equals(elementos, categoria.elementos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elementos, nroTema);
    }
}
