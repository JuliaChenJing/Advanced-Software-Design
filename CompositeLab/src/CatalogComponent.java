
public abstract class CatalogComponent {
	protected String title;

	public CatalogComponent(String title) {
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
