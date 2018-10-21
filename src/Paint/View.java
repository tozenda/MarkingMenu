package Paint;

import java.util.HashMap;
import java.util.List;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.RenderingHints;

import java.awt.event.*;
import javax.swing.*;

public class View extends JFrame{

    private Model m;
    private Controller c;

    public View(String title, Model m, Controller c){
        super(title);
        this.m = m;
        this.c = c;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 600));

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
                this.addMouseMotionListener(new MouseAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        c.draw(e);
                    }
                });

                this.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        c.mouseReleased(e);
                    }
                    @Override
                    public void mousePressed(MouseEvent e){
                        c.mousePressed(e);
                    }
                });
            }
        });

        add(createMenu(), BorderLayout.NORTH);

        pack();
        setVisible(true);
    }

    private JMenuBar createMenu(){
        JMenuBar menuBar = new JMenuBar();
        JMenu toolsMenu = new JMenu("Tools");
        JMenu colorMenu = new JMenu("Colors");

        {
            JMenuItem blackButton = new JMenuItem("black");
            blackButton.addActionListener(e -> c.changeColor(Color.BLACK));
            colorMenu.add(blackButton);

            JMenuItem yellowButton = new JMenuItem("yellow");
            yellowButton.addActionListener(e -> c.changeColor(Color.YELLOW));
            colorMenu.add(yellowButton);

            JMenuItem blueButton = new JMenuItem("blue");
            blueButton.addActionListener(e -> c.changeColor(Color.BLUE));
            colorMenu.add(blueButton);
        }

        {
            JMenuItem penButton = new JMenuItem("Pen");
            penButton.addActionListener(e -> c.changeTool(Tools.Pen));
            toolsMenu.add(penButton);

            JMenuItem ovalButton = new JMenuItem("Oval");
            ovalButton.addActionListener(e -> c.changeTool(Tools.Oval));
            toolsMenu.add(ovalButton);

            JMenuItem rectangleButton = new JMenuItem("Rectangle");
            rectangleButton.addActionListener(e -> c.changeTool(Tools.Rectangle));
            toolsMenu.add(rectangleButton);
        }

        menuBar.add(toolsMenu);
        menuBar.add(colorMenu);

        return menuBar;
    }


}
