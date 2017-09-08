
import java.awt.ComponentOrientation;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class administradorLista extends Thread {

    private JTable tabla;

    public administradorLista(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public void run() {
        while (true) {
            DefaultTableModel m = (DefaultTableModel)tabla.getModel();
            for (Persona p : Laboratorio7.lugares.get(MIN_PRIORITY).getHabitantes()) {
                Object[] newrow = {p.getNombre(),p.getId(),p.getLugar(),p.getEdad(),p.getEstatura(),p.getProfesion()};
                m.addRow(newrow);
            }
        }
    }
}
