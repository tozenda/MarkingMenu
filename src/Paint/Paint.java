package Paint;

import javax.swing.*;

public class Paint {
    public static void main(String argv[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Model m = new Model();
                Controller c = new Controller(m);
                View paint = new View("Paint",m,c);
            }
        });
    }
}
