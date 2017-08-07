package order;

public class Order {
	private String orderNumber;
	private double totalamount;
	private boolean international;
	private Customer customer;

	public Order(String orderNumber, double totalamount, boolean international,
			Customer customer) {
		this.orderNumber = orderNumber;
		this.totalamount = totalamount;
		this.international = international;
		this.customer = customer;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

	public boolean isInternational() {
		return international;
	}

	public void setInternational(boolean international) {
		this.international = international;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
