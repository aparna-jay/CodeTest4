package codetest4;

public class Order {
	private String orderID;
	private String customerName, pickedUpBy,delLocation, delPerson, status;
	private double cost;
	
	public Order(String orderID, String customerName, String pickedUpBy, String delLocation, String status) {
		super();
		this.orderID = orderID;
		this.customerName = customerName;
		this.pickedUpBy = pickedUpBy;
		this.delLocation = delLocation;
		this.status = status;
		
	}

	public String getDelPerson() {
		Employee e = new Employee();
		this.delPerson = e.getEmployeeID();
		return delPerson;
	}

	public void printOrder() {
		System.out.println("Order ID: " + orderID);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Picked by: " + pickedUpBy);
		System.out.println("Delivery Location: " + delLocation);
		System.out.println("Delivery Person: " + getDelPerson());
		System.out.println("Delivery status:" + status);	
	}
	
}
