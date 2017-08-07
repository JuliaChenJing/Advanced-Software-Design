package order;

public class Order {
	String ordernumber;
	Double totalAmount;
	Boolean international;
	String name;
	public Order(String ordernumber, Double totalAmount, Boolean international ,String name) {
		super();
		this.ordernumber = ordernumber;
		this.totalAmount = totalAmount;
		this.international = international;
		this.name = name;
	}
	
	
	
	
}
