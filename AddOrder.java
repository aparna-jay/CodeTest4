package codetest4;

import java.util.Scanner;
import java.util.Random;

public class AddOrder {
	public static void main(String[] args) {

		String orderType;
		String orderID;
		String customerName, pickedUpBy, delLocation, delPerson, status = "Not delivered";

		System.out.println("Choose order type (express/normal): ");
		Scanner sc = new Scanner(System.in);
		orderType = sc.next();

		Random rand = new Random();

		ManageOrder manageOrder = new ManageOrder();

		System.out.println("Customer Name: ");
		customerName = sc.next();
		System.out.println("Picked by: ");
		pickedUpBy = sc.next();
		System.out.println("Delivery Location: ");
		delLocation = sc.next();

		if (orderType.toLowerCase().equals("express")) {
			orderID = "EO00" + rand.nextInt(100);
			Order eOrder = new ExpressOrder(orderID, customerName, pickedUpBy, delLocation, status);
			manageOrder.getOrderDetails();
			eOrder.printOrder();
			System.out.println("Cost: " + manageOrder.getCost()*1.5);

		} else if (orderType.toLowerCase().equals("normal")) {
			orderID = "NO00" + rand.nextInt(100);
			Order nOrder = new NormalOrder(orderID, customerName, pickedUpBy, delLocation, status);
			manageOrder.getOrderDetails();
			nOrder.printOrder();
			System.out.println("Cost: " + manageOrder.getCost());
		} else {
			System.out.println("Please enter a valid order type (express/normal)");
		}

	}

}
