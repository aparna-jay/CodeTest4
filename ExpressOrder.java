package codetest4;

import java.time.*;

public class ExpressOrder extends Order {
	private LocalDateTime dateTime;

	public ExpressOrder(String orderID, String customerName, String pickedUpBy, String delLocation, String status) {
		super(orderID, customerName, pickedUpBy, delLocation, status);
	}

	public void printOrder() {
		super.printOrder();
		System.out.println("Delivery Type: " + "Express delivery");
	}

}
