import java.util.*;

public class CategoryComposite extends CatalogComponent{
	
    private Collection<CatalogComponent> list = new ArrayList<CatalogComponent>();

	public CategoryComposite(String title) {
		super(title);
	}

    public void addItem(CatalogComponent item){
    	list.add(item);
    }
    
	public void print() {
		System.out.println( "Category name=" + title );
		for (CatalogComponent item : list){
			item.print();
		}
	}
}