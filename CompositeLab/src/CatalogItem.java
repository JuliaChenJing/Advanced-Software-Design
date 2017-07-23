
public abstract class CatalogItem {
	protected String title;

	public CatalogItem(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void print();

}
