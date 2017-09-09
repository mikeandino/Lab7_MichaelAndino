
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Administrador_Archivo  {
private ArrayList<Persona> lista = new ArrayList();
    private File archivo = null;

    public Administrador_Archivo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Persona> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Persona> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "lista=" + lista ;
    }
    
    public void setPersona(Persona p){
        this.lista.add(p);
    }
    
    public void cargarArchivo(){
        try {
            lista = new ArrayList();
            Persona temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Persona)objeto.readObject())!=null) {
                        lista.add(temp);
                    }
                } catch (EOFException e) {
                    //encotro el final del archivo
                }
                entrada.close();
                objeto.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Persona persona : lista) {
                bw.writeObject(persona);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
