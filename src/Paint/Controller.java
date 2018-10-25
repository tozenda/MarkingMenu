package Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.net.CookieHandler;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class Controller {
    Model m;
    private boolean isDrawing = false;
    private Point originalPoint;

    public Controller(Model m){
        this.m = m;
        
    }

    public void mousePressed(MouseEvent e){
        originalPoint = e.getPoint();
        if(e.isControlDown()) {
        	m.setCurrentPannel(m.menuPannel);
        }
    }
    
    public void draw(MouseEvent e){
        if(m.getCurrentTool() == Tools.Rectangle){
            Rectangle2D.Double rect;
            if(!isDrawing){
                rect = new Rectangle2D.Double();
                m.newShape(rect,m.getCurrentColor());
                isDrawing = true;
            }
            else{
                List<Shape> list = m.getShapes(m.getCurrentColor());
                rect = (Rectangle2D.Double) list.get(list.size()-1);
            }
            rect.setRect(min(e.getX(), originalPoint.getX()), min(e.getY(), originalPoint.getY()),
                    abs(e.getX()- originalPoint.getX()), abs(e.getY()- originalPoint.getY()));
            m.panel.repaint();
        }
        else if(m.getCurrentTool() == Tools.Pen){
            Path2D.Double path;
            if(!isDrawing){
                path = new Path2D.Double();
                path.moveTo(originalPoint.getX(),originalPoint.getY());
                m.newShape(path,m.getCurrentColor());
                isDrawing = true;
            }
            else{
                List<Shape> list = m.getShapes(m.getCurrentColor());
                path = (Path2D.Double)list.get(list.size() - 1);
            }
            path.lineTo(e.getX(), e.getY());
            m.panel.repaint();
        }
        else if(m.getCurrentTool() == Tools.Oval) {
            Ellipse2D.Double oval;
            if(!isDrawing){
                oval = new Ellipse2D.Double(originalPoint.getX(), originalPoint.getY(), 0, 0);
                m.newShape(oval, m.getCurrentColor());
                isDrawing = true;
            }
            else{
                List<Shape> list = m.getShapes(m.getCurrentColor());
                oval = (Ellipse2D.Double)list.get(list.size() - 1);
            }
            oval.setFrame(min(e.getX(), originalPoint.getX()), min(e.getY(), originalPoint.getY()),
                    abs(e.getX()- originalPoint.getX()), abs(e.getY()- originalPoint.getY()));
            m.panel.repaint();
        }

    }

    public void mouseReleased(MouseEvent e) {
        this.isDrawing = false;
        if(e.isControlDown()) {
        	m.setCurrentPannel(m.panel);
        }
    }

    public void changeColor(Color c){ m.changeColor(c); }

    public void changeTool(Tools t){ m.changeCurrentTool(t);}

}
