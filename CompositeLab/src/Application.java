
public class Application {

	public static void main(String [] args){
		Category computerBookCategory=new Category("ComputerBookCategory");
		Category umlBookCategory=new Category("UML");		
		Category javaBookCategory=new Category("Java");
		
		Book book1=new Book("123456789", "UML 2 for beginners");
		Book book2=new Book("234567891", "UML essentials");
		Book book3=new Book("345678912", "Java in 21 days");
		Book book4=new Book("456789123", "Java generics");
		
		computerBookCategory.addItem(umlBookCategory);
		computerBookCategory.addItem(javaBookCategory);
		umlBookCategory.addItem(book1);
		umlBookCategory.addItem(book1);
		javaBookCategory.addItem(book3);
		javaBookCategory.addItem(book4);
		
		computerBookCategory.print();
		
		
	}
}
