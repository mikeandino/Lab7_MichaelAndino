
import java.io.Serializable;

public class Persona implements Serializable {

    public final long SerializableUID = 222L;
    private String nombre;
    private String id;
    private String lugar;
    private int edad;
    private String estatura;
    private String profesion;

    public Persona() {
    }

    public Persona(String nombre, String id, String lugar, int edad, String estatura, String profesion) {
        this.nombre = nombre;
        this.id = id;
        this.lugar = lugar;
        this.edad = edad;
        this.estatura = estatura;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar.toString();
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
