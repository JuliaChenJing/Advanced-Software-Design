package order;

public abstract class OrderHandler {
	protected OrderHandler nextHandler;
	public abstract void handleOrder(Order order);
	
	public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

	
}
