import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuCircular extends JPanel {
	
	private LinkedList<MenuElement> listeElement;
	private MenuCircular[] next;
	private String opt;
	private int elementPrint = 0;
	private int nbElement;
	private static int elementID;
	int menuX;
	int menuY;
	
	public MenuCircular(MenuCircular[] next, LinkedList<MenuElement> listeElement, String opt) {
		this.next = next;
		this.listeElement = listeElement;
		this.opt = opt;
		this.nbElement = listeElement.size();
		this.setSize(500, 500);
		int menuX = this.getWidth()/2;
		int menuY = this.getHeight()/2;
		System.out.println(menuX);
	}
	
	public void openMenu() {
		setLayout(null);
		
		for(int i = elementPrint ; i<nbElement ; i++) {
			int x = (int) (200 + 50*Math.cos(Math.PI*i/4));
			int y = (int) (200 + 50*Math.sin(Math.PI*i/4));
//			this.add(new JLabel("oui"));
			add(listeElement.get(i));
			listeElement.get(i).setBounds(x, y, 50, 50);
		}
//		Paint.setOpt(opt, listeElement.get(elementID).getValue());
		if(next!=null) {
			if(next.length==1) {
				next[0].openMenu();
			} else {
				next[elementID].openMenu();
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		openMenu();
		g.setColor(Color.cyan);
		g.fillOval(200, 200, 200, 200);
		repaint();
	}
	
	public static void setOpt(int element) {
		elementID = element;
	}
}
