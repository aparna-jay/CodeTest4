package codetest4;

import java.util.Scanner;

public class ManageOrder {
	int weight, travelDistance, pricePerKm, cost;

	public int getWeight() {
		return weight;
	}
	
	public int getTravelDistance() {
		return travelDistance;
	}

	public int getPricePerKm() {
		return pricePerKm;
	}

	public void getOrderDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight of package:");
		this.weight = sc.nextInt();
		System.out.println("Enter travel distance:");
		this.travelDistance = sc.nextInt();
		System.out.println("Enter price per km:");
		this.pricePerKm = sc.nextInt();
	}
	
	public int getCost() {
		cost =  this.weight * this.travelDistance * this.pricePerKm;
		return cost;
	}
}
