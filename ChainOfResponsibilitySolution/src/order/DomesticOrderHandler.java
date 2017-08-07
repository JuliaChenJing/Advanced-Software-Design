package order;

public class DomesticOrderHandler extends OrderHandler{
    
	public DomesticOrderHandler(OrderHandler nexthandler) {
		super(nexthandler);
	}

	public void handleOrder(Order order) {
		System.out.println("DomesticOrderHandler handles order "+order.getOrderNumber());
	}

}
