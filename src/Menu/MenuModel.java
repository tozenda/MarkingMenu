package Menu;

import MenuTemplate.ElementMenu;
import MenuTemplate.MenuTemplate;

import java.util.LinkedList;

public class MenuModel {
	
	private LinkedList<ElementMenu> listeElement;
	private MenuModel[] next;

	private MenuTemplate menuTemplate;
	private String opt;
	private int elementPrint = 0; // indice du premier élément a affiché
	private int nbElement;
	private static int elementID;
	
	public MenuModel(MenuTemplate menuTemplate, String opt) {
		this.menuTemplate = menuTemplate;
		this.opt = opt;
	}
	
	public Object getValue() {
		return(listeElement.get(elementID));
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

	public LinkedList<ElementMenu> getListeElement() {
		return listeElement;
	}

	public void setListeElement(LinkedList<ElementMenu> listeElement) {
		this.listeElement = listeElement;
	}

	public MenuModel[] getNext() {
		return next;
	}

	public void setNext(MenuModel[] next) {
		this.next = next;
	}

	public static int getElementID() {
		return elementID;
	}

	public static void setElementID(int elementID) {
		MenuModel.elementID = elementID;
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
