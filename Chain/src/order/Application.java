package order;

public class Application {
	
	public static void main(String[]args) {
		String orderNumber = "111";
		Double totalAmount = 90.0;
		Boolean isInternational = false;
		String name = "Julia";
		Order order = new Order(orderNumber, totalAmount, isInternational, name);
		
		OrderReceiver orderReceiver = new OrderReceiver();
		orderReceiver.receiveOrder(order);
		
	}
}
