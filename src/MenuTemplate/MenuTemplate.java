package MenuTemplate;

import java.util.List;

import javax.swing.JPanel;

import Menu.MenuView;

public class MenuTemplate {
    private MenuTemplate nextLevelMenuTemplate;
    private List<ElementMenu> menuElements;
    private MenuView menuView;
    
    public MenuTemplate getNextLevelMenuTemplate() {
        return nextLevelMenuTemplate;
    }

    public void setNextLevelMenuTemplate(MenuTemplate nextLevelMenuTemplate) {
        this.nextLevelMenuTemplate = nextLevelMenuTemplate;
    }

    public List<ElementMenu> getMenuElements() {
        return menuElements;
    }

    public void setMenuElements(List<ElementMenu> menuElements) {
        this.menuElements = menuElements;
    }
    
    public void setmenuView(MenuView v) {
    	this.menuView = menuView;
    }

	public JPanel getMenuView() {
		return menuView;
	}
}