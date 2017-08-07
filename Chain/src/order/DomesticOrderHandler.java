package order;

public class DomesticOrderHandler extends OrderHandler{

	@Override
	public void handleOrder(Order order) {
		System.out.println("this order is handled by DomesticOrderHandler");
	}

}
