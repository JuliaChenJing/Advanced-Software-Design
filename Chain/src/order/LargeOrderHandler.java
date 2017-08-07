package order;

public class LargeOrderHandler extends OrderHandler{

	@Override
	public void handleOrder(Order order) {
		// TODO Auto-generated method stub
		if (order.totalAmount > 30000) {
			//handle order
		}
		else{
			if (this.nextHandler != null) {
				this.nextHandler.handleOrder(order);
			}
		}
	}

}
