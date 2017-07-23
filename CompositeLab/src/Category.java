import java.util.*;


public class Category extends CatalogItem{
    private Collection<CatalogItem> list = new ArrayList<CatalogItem>();

	public Category(String title) {
		super(title);
	}

    public void addItem(CatalogItem item){
    	list.add(item);
    }
    
	public void print() {
		System.out.println( "Category name=" + title );
		for (CatalogItem item : list){
			item.print();
		}
	}
}