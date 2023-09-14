package model;

public class Customer {

	private int  customerId;
	private String customerName;
	private  long customerphone;
	private Address address;
	private Order order;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(long customerphone) {
		this.customerphone = customerphone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerphone="
				+ customerphone + ", address=" + address + ", order=" + order + "]";
	}
	
	
	
}
