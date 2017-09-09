
import java.awt.ComponentOrientation;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class administradorLista extends Thread {

    
    private JTable tabla;
    
    private ArrayList<Persona> personas = new ArrayList<>();
    
    public administradorLista(JTable tabla, ArrayList<Persona> personas) {
        this.tabla = tabla;
        this.personas = personas;
    }

    @Override
    public void run() {
        while (true) {
            if (personas.size() >= 1) {
                DefaultTableModel m = (DefaultTableModel) tabla.getModel();
                for (int i = 0; i < personas.size(); i++) {
                    if (true) {
                        
                    }
                    Object[] newrow = {p.getNombre(), p.getId(), p.getLugar(), p.getEdad(), p.getEstatura(), p.getProfesion()};
                    m.addRow(newrow);
                }
                tabla.setModel(m);
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
                }
            }
        }
    }
}
