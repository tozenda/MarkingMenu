package Menu;

import MenuTemplate.ElementMenu;
import MenuTemplate.MenuTemplate;
import Paint.Model;

import java.util.LinkedList;

public class MenuModel {

	private Model paintModel;

	private MenuTemplate menuTemplate;
	private String opt;
	private int elementPrint = 0; // indice du premier élément a affiché
	private int nbElement;
	private int elementID;

	public MenuModel(MenuTemplate menuTemplate, String opt, Model paintModel) {
		this.menuTemplate = menuTemplate;
		this.opt = opt;
		this.paintModel = paintModel;
	}


	public int getNbElement() {
		return nbElement;
	}

	public void setNbElement(int nbElement) {
		this.nbElement = nbElement;
	}

	public int getElementPrint() {
		return elementPrint;
	}

	public void setElementPrint(int elementPrint) {
		this.elementPrint = elementPrint;
	}

	public int getElementID() {
		return elementID;
	}

	public void setElementID(int elementID) {
		this.elementID = elementID;
		if(opt=="tool") {
			this.paintModel.changeCurrentTool(this.menuTemplate.getMenuElements().get(elementID).getTool());
		} else if (opt=="color") {
			this.paintModel.changeColor(this.menuTemplate.getMenuElements().get(elementID).getColor());
		}
		if(menuTemplate.getNextLevelMenuTemplate()!=null) {
			this.paintModel.menuPannel = menuTemplate.getNextLevelMenuTemplate().getMenuView();
			this.paintModel.menuPannel.repaint();
		}
	}

	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	public MenuTemplate getMenuTemplate() {
		return menuTemplate;
	}

	public void setMenuTemplate(MenuTemplate menuTemplate) {
		this.menuTemplate = menuTemplate;
	}
}
