package codetest4;

public class NormalOrder extends Order {

	public NormalOrder(String orderID, String customerName, String pickedUpBy, String delLocation,
			 String status) {
		super(orderID, customerName, pickedUpBy, delLocation, status);
		
	}

	public void printOrder() {
		super.printOrder();
		System.out.println("Delivery Type: " + "Normal delivery");
		}


}
