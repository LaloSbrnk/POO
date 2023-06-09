public class Proceso implements Comparable<Proceso>{
    private String id;
    private int requerimientoMem;

    public Proceso(String id, int requerimientoMem) {
        this.id = id;
        this.requerimientoMem = requerimientoMem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRequerimientoMem() {
        return requerimientoMem;
    }

    @Override
    public int compareTo(Proceso otro) {
        //return this.getRequerimientoMem() - otro.getRequerimientoMem();
        return (this.getId().compareTo(otro.getId()));
    }
}
