import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TiendaOnline tienda = new TiendaOnline();

        ElementoTienda p1 = new Producto("Mecha Hormigon", 125, 457, 1851, "Omaha");
        ElementoTienda p2 = new Producto("Mecha Madera", 80, 387, 3560, "Marca2");
        ElementoTienda p3 = new Producto("Mecha Acero", 130, 530, 196, "Marca3");

        Combo c1 = new Combo("Combo 1");
        Combo c2 = new Combo("Combo 2");

        c2.addElemento(p2);
        c1.addElemento(p1);
        c1.addElemento(p3);
        c1.addElemento(c2);

        tienda.addElemento(c1);

        Condicion cond1 = new CondPrecioMayor(1700);

        TiendaOnline tienda2 = tienda.getCopia(cond1);

        ArrayList<ElementoTienda> resultado;

        resultado = tienda2.buscar(cond1);

        System.out.println(resultado);







    }
}