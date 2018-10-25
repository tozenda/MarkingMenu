package MenuTemplate;

import java.util.List;

public class MenuTemplate {
    private MenuTemplate nextLevelMenuTemplate;
    private List<ElementMenu> menuElements;

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
}