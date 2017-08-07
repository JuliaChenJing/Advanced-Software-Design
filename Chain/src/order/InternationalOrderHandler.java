package order;

public class InternationalOrderHandler extends OrderHandler{

	@Override
	public void handleOrder(Order order) {
		// TODO Auto-generated method stub
		if (order.international) {
			//handle order
		}
		else{
			if (this.nextHandler != null) {
				this.nextHandler.handleOrder(order);
			}
		}
	}

}

