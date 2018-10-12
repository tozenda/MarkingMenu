import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MenuCircular extends JPanel {
	
	private LinkedList<MenuElement> listeElement;
	private MenuCircular next;
	private String opt;
	private String value;
	private int element = 0;
	
	public MenuCircular(MenuCircular next, LinkedList<MenuElement> listeElement, String value) {
		this.next = next;
		this.listeElement = listeElement;
		this.value = value;
	}
	
	public void openMenu() {
		setLayout(null);
		int menuX = this.getWidth()/2;
		int menuY = this.getHeight()/2;
		for(int i = element ; i<element+8 ; i++) {
			int x = menuX += 200*Math.cos(Math.PI*i/4);
			int y = menuY += 200*Math.sin(Math.PI*i/4);
			listeElement.get(i).setLocation(new Point(x, y));;
			add(listeElement.get(i));
		}
		// affiche les éléments (apelle methode paint de MenuElement
		// Ouvre le suivant
		
//		Paint.setOpt(opt, value);
	}
	
	public void paintComponent(Graphics g) {
		
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}
}
