package order;

public class LargeOrderHandler extends OrderHandler{

	@Override
	public void handleOrder(Order order) {
		// TODO Auto-generated method stub
		if (order.getTotalAmount() > 30000) {
			System.out.println("this order is handled by LargeOrderHandler");
		}
		else{
			if (this.nextHandler != null) {
				this.nextHandler.handleOrder(order);
			}
		}
	}

}
