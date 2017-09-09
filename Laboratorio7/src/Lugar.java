
import java.util.ArrayList;
import java.util.Date;

public class Lugar {
    private String nombre;
    private String clima; 
    private long extension;
    private long habitantes;
    private String zona;
    private Date fundacion;

    public Lugar() {
    }

    public Lugar(String nombre, String clima, long extension, long nhabitantes, String zona, Date fundacion) {
        this.nombre = nombre;
        this.clima = clima;
        this.extension = extension;
        this.habitantes = nhabitantes;
        this.zona = zona;
        this.fundacion = fundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public long getExtension() {
        return extension;
    }

    public void setExtension(long extension) {
        this.extension = extension;
    }

    public long getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(long nhabitantes) {
        this.habitantes = nhabitantes;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
