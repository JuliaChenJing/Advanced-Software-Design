package order;

public class Application {
	
	public static void main(String[]args) {
		String orderNumber = "111";
		Double totalAmount = 90.0;
		Boolean isInternational = false;
		String customerName = "Julia";
		Order order = new Order(orderNumber, totalAmount, isInternational, customerName);
		
		OrderReceiver orderReceiver = new OrderReceiver();
		orderReceiver.receiveOrder(order);
		
	}
}
