public class CentroComputos {
    private ListaOrdenada computadorasLibres;
    private ListaOrdenada procesos;

    public CentroComputos(){
        computadorasLibres = new ListaOrdenada();
        procesos = new ListaOrdenada();
    }

    public void arribaProceso(Proceso nuevo){
        if (computadorasLibres.vacia()){
            procesos.agregar(nuevo);
            //Lo siguiente va a compilar, pero cuando lo ejecute
            //al intentar comparar Computadoras con Procesos
            //va a dar ClassCastException
            //procesos.agregar(new Computadora("asdaf",123));
        }
        else {
            Computadora compuLibre = (Computadora) computadorasLibres.siguiente();
            compuLibre.ejecutarProceso(nuevo);
            //cuando termina la ejecución debería volver a estar libre
        }
    }
    public void liberarComputadora(Computadora nueva){
        if (procesos.vacia()){
            computadorasLibres.agregar(nueva);
        }
        else {
            Proceso aEjecutar = (Proceso) procesos.siguiente();
            nueva.ejecutarProceso(aEjecutar);
            //cuando termina la ejecución debería volver a estar libre la computadora
        }
    }
}
