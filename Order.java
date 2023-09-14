package model;

public class Order {

	private String orderID;
	private String orderName;
	public String getOrderId() {
		return orderID;
	}
	public void setOrderId(String orderID) {
		this.orderID = orderID;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", orderName=" + orderName + "]";
	}

	
}
