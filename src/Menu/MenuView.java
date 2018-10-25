package Menu;

import MenuTemplate.MenuTemplate;
import MenuTemplate.ElementMenu;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;


public class MenuView extends JPanel {
	
	private MenuModel m;
    private MenuController c;
    
    public MenuView(MenuModel m, MenuController c) {
    	setLayout(null);

		int i = 0;
        List<ElementMenu> elements = m.getMenuTemplate().getMenuElements();

		for(ElementMenu element : elements){
		    int x = (int) (400 + 100*Math.cos(Math.PI*i/4));
            int y = (int) (250 + 100*Math.sin(Math.PI*i/4));
            i++;
            add(element);
            element.setBounds(x, y, 50, 50);
        }
    }
    
    // dessin du menu
    public void paintComponent(Graphics g) {
		g.setColor(Color.cyan);
		g.fillOval(300, 150, 250, 250);
		repaint();
	}
}
