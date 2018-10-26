package Menu;

public class MenuController{
    
	MenuModel m;

    public MenuController(MenuModel m){
    	this.m = m;
    }

	public void updateElementID(int elementID) {
		m.setElementID(elementID);
	}
}

