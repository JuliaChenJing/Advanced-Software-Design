package order;

public class InternationalOrderHandler extends OrderHandler{
    
	public InternationalOrderHandler(OrderHandler nexthandler) {
		super(nexthandler);
	}

	public void handleOrder(Order order) {
		boolean found = false;
		if (order.isInternational()){
			found=true;
			System.out.println("InternationalOrderHandler handles order "+order.getOrderNumber());
		}
		else
			nexthandler.handleOrder(order);
	}

}
