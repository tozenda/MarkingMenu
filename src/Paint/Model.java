package Paint;

import javax.swing.*;

import Menu.*;
import Menu.MenuElement;

import java.awt.Shape;
import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Model {
    private HashMap<Color, List<Shape>> shapes = new HashMap<>();
    public JPanel panel;
    public JPanel menuPannel;
    private JPanel currentPanel = panel;
    private Tools currentTool = Tools.Oval;
    private Color currentColor = Color.BLUE;

    public void newShape(Shape s, Color c){
        
    	List<Shape> shapeForColor = shapes.get(c);
        if(shapeForColor == null){
            shapeForColor = new LinkedList<>();
        }
        shapeForColor.add(s);
        this.shapes.put(c,shapeForColor);
        
        LinkedList<MenuElement> listeElement = new LinkedList<MenuElement>();
        listeElement.add(new MenuElement("Oval", Tools.Oval));
        listeElement.add(new MenuElement("Pen", Tools.Pen));
        listeElement.add(new MenuElement("Rectangle", Tools.Rectangle));
		MenuModel menuM = new MenuModel(null, listeElement , "tool");
		MenuController menuC = new MenuController(menuM);
		MenuView menuV = new MenuView(menuM, menuC);
		menuV.addMouseListener(menuC);
		menuPannel = menuV;
    }

    public HashMap<Color, List<Shape>> getShapes(){
        return this.shapes;
    }

    public List<Shape> getShapes(Color c){
        return this.shapes.get(c);
    }

    public Tools getCurrentTool(){
        return this.currentTool;
    }
    
    public void setCurrentPannel(JPanel panel) {
    	setCurrentPanel(panel);
    }

    public void changeCurrentTool(Tools tool){
        currentTool = tool;
    }

    public Color getCurrentColor(){ return this.currentColor; }

    public void changeColor(Color color){ this.currentColor = color; }

	public JPanel getCurrentPanel() {
		return currentPanel;
	}

	public void setCurrentPanel(JPanel currentPanel) {
		this.currentPanel = currentPanel;
	}



}
