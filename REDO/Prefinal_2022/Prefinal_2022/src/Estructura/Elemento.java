package Estructura;

import Filtros.Condicion;

public abstract class Elemento {

    public abstract String getPalClaves();
    public abstract String getTema();
    public abstract Elemento getCopia(Condicion cc);
    public abstract int getCantNoticias(Condicion cc);


}
