
public class DVD extends CatalogItem{


	public DVD(String title) {
		super(title);
	}

	
	public void print(){
		System.out.println("DVD [title=" + title +  "]");
	}
}
