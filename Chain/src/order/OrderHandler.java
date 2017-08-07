package order;

public abstract class OrderHandler {
	public abstract void handleOrder(Order order);
	protected OrderHandler nextHandler;
	
	public void setNextLeader(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

	
}
