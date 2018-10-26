package Paint;

import javax.swing.*;

import Menu.*;
import MenuTemplate.ElementMenu;
import MenuTemplate.MenuTemplate;

import java.awt.Shape;
import java.awt.Color;
import java.awt.Container;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Model {
    private HashMap<Color, List<Shape>> shapes = new HashMap<>();

    public JPanel panel;
    public JPanel menuPannel;
    private JPanel currentPanel = panel;
    // currentPanel est le panel à afficher par la vue. On switch entre le pannel de Paint et le pannel de menu
    private Tools currentTool = Tools.Oval;
    private Color currentColor = Color.BLUE;
    private boolean isMarkingMenuOpenned = false;

    public Model() {
    	
    	LinkedList<ElementMenu> listeElement = new LinkedList<ElementMenu>();
    	listeElement.add(new ElementMenu(Tools.Oval, "Oval"));
    	listeElement.add(new ElementMenu(Tools.Rectangle, "Rectangle"));
    	listeElement.add(new ElementMenu(Tools.Pen, "Pen"));
        MenuTemplate toolTemplate = new MenuTemplate();
        toolTemplate.setMenuElements(listeElement);
        MenuModel menuM = new MenuModel(toolTemplate, "tool", this);
		MenuController menuC = new MenuController(menuM);
		MenuView menuV = new MenuView(menuM, menuC);
		
		LinkedList<ElementMenu> listeElementColor = new LinkedList<ElementMenu>();
		listeElementColor.add(new ElementMenu(Color.black, "Black"));
		listeElementColor.add(new ElementMenu(Color.gray, "Gray"));
		listeElementColor.add(new ElementMenu(Color.BLUE, "Blue"));
		listeElementColor.add(new ElementMenu(Color.YELLOW, "Yellow"));
		listeElementColor.add(new ElementMenu(Color.green, "Green"));
		listeElementColor.add(new ElementMenu(Color.ORANGE, "Orange"));
		listeElementColor.add(new ElementMenu(Color.MAGENTA, "Magenta"));
        MenuTemplate colorTemplate = new MenuTemplate();
        colorTemplate.setMenuElements(listeElementColor);
        MenuModel menuColorM = new MenuModel(colorTemplate, "color", this);
		MenuController menuColorC = new MenuController(menuColorM);
		MenuView menuColorV = new MenuView(menuColorM, menuColorC);
		
		toolTemplate.setNextLevelMenuTemplate(colorTemplate);
		toolTemplate.setmenuView(menuV);
		colorTemplate.setmenuView(menuColorV);
		menuPannel = menuV;
    }
    
    public void newShape(Shape s, Color c){
        
    	List<Shape> shapeForColor = shapes.get(c);
        if(shapeForColor == null){
            shapeForColor = new LinkedList<>();
        }
        shapeForColor.add(s);
        this.shapes.put(c,shapeForColor);
        
        
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

    public boolean isMarkingMenuOpenned(){
        return this.isMarkingMenuOpenned;
    }

	public JPanel getCurrentPanel() {
		return currentPanel;
	}

	public void setCurrentPanel(JPanel currentPanel) {
		this.currentPanel = currentPanel;
	}
}
