package order;


public class LargeOrderHandler extends OrderHandler{
    
	public LargeOrderHandler(OrderHandler nexthandler) {
		super(nexthandler);
	}

	public void handleOrder(Order order) {
		if (order.getTotalamount()> 100000.0){
			System.out.println("LargeOrderHandler handles order "+order.getOrderNumber());
		}
		else
			nexthandler.handleOrder(order);
	}

}
