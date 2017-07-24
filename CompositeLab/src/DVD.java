
public class DVD extends CatalogComponent{

	public DVD(String title) {
		super(title);
	}

	
	public void print(){
		System.out.println("DVD [title=" + title +  "]");
	}
}
