package Menu;
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

public class MenuElement extends JLabel {
	
	Color color;
	Tools tool;
	
	public MenuElement(String value, Color color) {
		this.setText(value);
		this.color = color;
	}
	
	public MenuElement(String value, Tools tool) {
		this.setText(value);
		this.tool = tool;
	}

	public Tools getTool() {
		// TODO Auto-generated method stub
		return tool;
	}
	
	public void setTool(Tools tool) {
		this.tool = tool;
	}
	
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

}
