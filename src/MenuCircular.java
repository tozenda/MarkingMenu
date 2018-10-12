import java.util.LinkedList;

public class MenuCircular {
	
	private LinkedList<MenuElement> listeElement;
	private MenuCircular next;
	private String value;
	
	public MenuCircular(MenuCircular next, LinkedList<MenuElement> listeElement) {
		this.next = next;
		this.listeElement = listeElement;
	}
	
	public void openMenu() {
		// affiche les éléments (apelle methode paint de MenuElement
		// Listener du clique et récup valeur
		// Ouvre le suivant
		// Paint.java apès avoir appellée openMenu récupère value avec le getter
	}
	
	public String getValue() {
		return value;
	}
	
}
