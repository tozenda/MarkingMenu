package Paint;

import javax.swing.*;
import java.awt.Shape;
import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Model {
    private HashMap<Color, List<Shape>> shapes = new HashMap<>();
    public JPanel panel;
    private Tools currentTool = Tools.Oval;
    private Color currentColor = Color.BLUE;
    private boolean isMarkingMenuOpenned = false;

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

    public void changeCurrentTool(Tools tool){
        currentTool = tool;
    }

    public Color getCurrentColor(){ return this.currentColor; }

    public void changeColor(Color color){ this.currentColor = color; }

    public boolean isMarkingMenuOpenned(){
        return this.isMarkingMenuOpenned;
    }

    public void setMarkingMenuOpenned(boolean value){
        this.isMarkingMenuOpenned = value;
    }
}
