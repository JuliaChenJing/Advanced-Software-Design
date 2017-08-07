package order;

public abstract class OrderHandler {
	
	protected OrderHandler nexthandler;
	
	
    public OrderHandler(OrderHandler nexthandler) {
		this.nexthandler = nexthandler;
	}

    public abstract void handleOrder(Order order);
}
