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

public class MenuController{
    
	MenuModel m;

    public MenuController(MenuModel m){
    	
    }

	public void updateElementID(int elementID) {
		MenuModel.setElementID(elementID);
	}
}

