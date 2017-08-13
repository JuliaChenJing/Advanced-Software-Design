package app;

import order.Order;
import order.OrderReceiver;
import order.Customer;

public class Application {
	
	public static void main(String[]args) {
		String orderNumber = "111";
		Double totalAmount = 90.0;
		Boolean isInternational = false;
		Customer customerName = new Customer("Julia");
		
		Order order = new Order(orderNumber, totalAmount, isInternational, customerName);
		
		OrderReceiver orderReceiver = new OrderReceiver();
		orderReceiver.receiveOrder(order);
		
	}
}
