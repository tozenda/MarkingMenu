package MenuTemplate;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Paint.Tools;

public class ElementMenu extends JLabel {

    private Color color;
    private Tools tool;

	//construction d un élément couleur
	public ElementMenu(String value, Color color, String label) {
		this.setText(value);
		this.color = color;
		this.setText(label);
	}

	// construction d un element Tool
	public ElementMenu(String value, Tools tool, String label) {
		this.setText(value);
		this.tool = tool;
		this.setText(label);
	}

	public Tools getTool() {
		return tool;
	}
	
	public void setTool(Tools tool) {
		this.tool = tool;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}
