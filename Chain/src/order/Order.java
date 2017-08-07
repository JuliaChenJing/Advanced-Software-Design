package order;

public class Order {
	private String ordernumber;
	private Double totalAmount;
	private Boolean international;
	String name;
	public Order(String ordernumber, Double totalAmount, Boolean international ,String name) {
		this.ordernumber = ordernumber;
		this.totalAmount = totalAmount;
		this.international = international;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
