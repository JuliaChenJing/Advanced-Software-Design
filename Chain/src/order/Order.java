package order;

public class Order {
	private String ordernumber;
	private Double totalAmount;
	private Boolean international;
	Customer customer;
	public Order(String ordernumber, Double totalAmount, Boolean international ,Customer customer) {
		this.ordernumber = ordernumber;
		this.totalAmount = totalAmount;
		this.international = international;
		this.customer = customer;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Boolean isInternational() {
		return international;
	}
	public void setInternational(Boolean international) {
		this.international = international;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
}
