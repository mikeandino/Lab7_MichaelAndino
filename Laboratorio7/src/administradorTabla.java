
import java.util.ArrayList;
import javax.swing.JFrame;

public class administradorTabla extends Thread{
    
    public JFrame frame;
    public ArrayList<Persona> personas = new ArrayList<>();
    
    public administradorTabla(JFrame frame, ArrayList<Persona> personas) {
        this.frame = frame;
        this.personas = personas;
    }
    
    public void run(){
        while (true) {
            frame.setVisible(true);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
