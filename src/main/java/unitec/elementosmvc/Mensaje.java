package unitec.elementosmvc;

import java.time.LocalDate;

public class Mensaje {

    public Mensaje(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    //Este campo es el ID
    private String id;
    private LocalDate fecha;
    private String cuerpo;

    public Mensaje(LocalDate fecha, String cuerpo) {
        this.fecha = fecha;
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    

    public Mensaje() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

}
