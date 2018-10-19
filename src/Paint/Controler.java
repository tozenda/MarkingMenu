package Paint;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class Controler {
    Model m;

    public Controler(Model m){
        this.m = m;
    }

    public void updateJPanel(JPanel panel){
        m.panel = panel;
    }

    public void draw(MouseEvent e){
        System.out.println("Hello x = "+e.getX()+" y = "+e.getY());
    }

}
