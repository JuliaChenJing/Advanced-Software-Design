package order;

public class InternationalOrderHandler extends OrderHandler{

	@Override
	public void handleOrder(Order order) {
		// TODO Auto-generated method stub
		if (order.isInternational()) {
			System.out.println("this order is handled by InternationalOrderHandler");
		}
		else{
			if (this.nextHandler != null) {
				this.nextHandler.handleOrder(order);
			}
		}
	}

}

