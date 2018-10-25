package Menu;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MenuView extends JPanel {
	
	private MenuModel m;
    private MenuController c;
    
    public MenuView(MenuModel m, MenuController c) {
    	setLayout(null);

		for(int i = m.getElementPrint() ; i<m.getNbElement() ; i++) {
			int x = (int) (400 + 100*Math.cos(Math.PI*i/4));
			int y = (int) (250 + 100*Math.sin(Math.PI*i/4));
			add(m.getListeElement().get(i));
			m.getListeElement().get(i).setBounds(x, y, 50, 50);
		}
    }
    
    
    public void paintComponent(Graphics g) {
		g.setColor(Color.cyan);
		g.fillOval(300, 150, 250, 250);
		repaint();
	}
}
