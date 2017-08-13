package application;
import java.util.*;

public class CatalogComposite extends CatalogComponent{
	
    private Collection<CatalogComponent> list = new ArrayList<CatalogComponent>();

	public CatalogComposite(String title) {
		super(title);
	}

    public void addItem(CatalogComponent item){
    	list.add(item);
    }
    
	public void print() {
		System.out.println( "\n------------Category name : " + title +"-----------\n");
		for (CatalogComponent item : list){
			item.print();
		}
	}
}