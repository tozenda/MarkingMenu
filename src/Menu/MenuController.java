package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.net.CookieHandler;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class MenuController implements MouseListener {
    
	MenuModel m;

    public MenuController(MenuModel m){
    	
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		int x = arg0.getX() - 425;
		int y = arg0.getY() - 275;
		double theta = ((Math.atan2(y,x)+Math.PI/2) * (180/Math.PI) + 90)/45 -4;
		int element = (int) Math.round(theta);
		System.out.println(element);
		MenuModel.setElementID(element);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}

