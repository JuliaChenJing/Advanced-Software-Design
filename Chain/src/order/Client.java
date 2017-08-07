package order;

public class Client {
	
	public static void main(String[]args) {
		String ordernumber = "XXXX";
		Double totalAmount = 909099.0;
		Boolean international = true;
		String name = "dodo";
		Order order = new Order(ordernumber, totalAmount, international, name);
		
		OrderReceiver orderReceiver = new OrderReceiver();
		orderReceiver.receiveOrder(order);
		
		
		
		
		
	}
}
