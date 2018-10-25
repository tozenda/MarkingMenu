package Menu;

import java.util.LinkedList;

public class MenuModel {
	
	private LinkedList<MenuElement> listeElement;
	private MenuModel[] next;
	private String opt;
	private int elementPrint = 0;
	private int nbElement;
	private static int elementID;
	
	public MenuModel(MenuModel[] next, LinkedList<MenuElement> listeElement, String opt) {
		this.setNext(next);
		this.setListeElement(listeElement);
		this.setOpt(opt);
		this.setNbElement(listeElement.size());
	
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

	public LinkedList<MenuElement> getListeElement() {
		return listeElement;
	}

	public void setListeElement(LinkedList<MenuElement> listeElement) {
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
}
