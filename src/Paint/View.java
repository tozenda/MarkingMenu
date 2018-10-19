package Paint;

import static java.lang.Math.*;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Point;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class View extends JFrame{
    private Model m;
    private Controler c;
    public View(String title, Model m, Controler c){
        super(title);
        this.m = m;
        this.c = c;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 600));
        add(new JToolBar() {{

        }}, BorderLayout.NORTH);

        add(m.panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D)g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setColor(Color.WHITE);
                g2.fillRect(0, 0, getWidth(), getHeight());
                HashMap<Color, List<Shape>> shapes = m.getShapes();
                for(Color color : shapes.keySet()) {
                    g2.setColor(color);
                    List<Shape> shapeForColor = shapes.get(color);
                    for (Shape shape: shapeForColor) {
                        g2.draw(shape);
                    }
                }
                this.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        System.out.println("Hello1");
                        c.draw(e);
                    }
                });
            }
        });

        pack();
        setVisible(true);
    }


}
