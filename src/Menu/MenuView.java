package Menu;

import MenuTemplate.MenuTemplate;
import MenuTemplate.ElementMenu;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
		this.addMouseListener(new MouseAdapter() {
            
            public void mousePressed(MouseEvent e){
            	int x = e.getX() - 425;
        		int y = e.getY() - 275;
        		double theta = ((Math.atan2(y,x)+Math.PI/2) * (180/Math.PI) + 90)/45 -4;
        		int element = (int) Math.round(theta);
        		System.out.println(element);
        		c.updateElementID(element);
            }
        });
    }
    
    // dessin du menu
    public void paintComponent(Graphics g) {
		g.setColor(Color.cyan);
		g.fillOval(300, 150, 250, 250);
		repaint();
	}
}
