package Menu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

		addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent arg0) {

			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
				int x = arg0.getX() - 425;
				int y = arg0.getY() - 275;
				double theta = ((Math.atan2(y,x)+Math.PI/2) * (180/Math.PI) + 90)/45 -4;
				int element = (int) Math.round(theta);
				System.out.println(element);
				elementID = element;
			}
			public void mouseReleased(MouseEvent arg0) {
			}
		});
	}

	public void openMenu() {
		setLayout(null);

		for(int i = elementPrint ; i<nbElement ; i++) {
			int x = (int) (400 + 100*Math.cos(Math.PI*i/4));
			int y = (int) (250 + 100*Math.sin(Math.PI*i/4));
			add(listeElement.get(i));
			listeElement.get(i).setBounds(x, y, 50, 50);
		}
		
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
		g.fillOval(300, 150, 250, 250);
		repaint();
	}
	
	
}
