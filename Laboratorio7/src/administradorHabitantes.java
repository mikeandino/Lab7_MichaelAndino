
import java.util.ArrayList;

public class administradorHabitantes extends Thread{
    
    public void run(){
        while (true) {
            for (Persona p : Laboratorio7.personas) {
                if (p.getLugar().equals(Lista.lugar.getNombre())) {
                    for (Persona p2 : Lista.lugar.getHabitantes()) {
                        if (!p.equals(p2)) {                            
                            Lista.lugar.addHabitantes(p);
                        }
                    }
                }
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
