package Paint;

import javax.swing.*;
import java.awt.Shape;
import java.awt.Color;
import java.util.HashMap;
import java.util.List;

public class Model {
    private HashMap<Color, List<Shape>> shapes = new HashMap<>();
    public JPanel panel;

    public void newShape(Shape s, Color c){
        List<Shape> shapeForColor = shapes.get(c);
        shapeForColor.add(s);
        this.shapes.put(c,shapeForColor);
    }

    public HashMap<Color, List<Shape>> getShapes(){
        return this.shapes;
    }

}
