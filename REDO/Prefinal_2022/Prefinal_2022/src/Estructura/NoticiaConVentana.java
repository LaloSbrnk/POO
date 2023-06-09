package Estructura;

import java.time.LocalDate;

public class NoticiaConVentana extends Noticia{

    private LocalDate f_limite;

    public NoticiaConVentana(String titulo, String texto, String autor, String tema, LocalDate f_limite) {
        super(titulo, texto, autor, tema);
        this.f_limite = f_limite;
    }

    public LocalDate getF_limite() {
        return f_limite;
    }

    public void setF_limite(LocalDate f_limite) {
        this.f_limite = f_limite;
    }

    public void addComent(Comentario c){
        LocalDate hoy = LocalDate.now();

        if(hoy.isAfter(this.f_limite))
            super.addComent(c);
    }
}
