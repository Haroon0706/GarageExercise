package com.qa.garageexercise;

import java.util.ArrayList;

public class Garage {
	
	public ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	
	public void addVehicle(Vehicle x) {
		
		vehicles.add(x);
		System.out.println(x.getMake() + " has been added to the garage");
		
	}
	
	
	public void removeVehicle(String Make) {
		
		int i = 0;
		
		for(Vehicle x : vehicles) {
			if (x.getMake() == Make) break;
			i++;
			
	}
		
		vehicles.remove(i);
		
		listVehicles();
	
		
	}
	
	
	public void fixingVehicle(Vehicle x) {
		System.out.println("Total Bill = " + x.calcBill());
		
		
	}
	
	public void listVehicles() {
		
		for(Vehicle x: vehicles ) {
			
			System.out.println(x.getMake());
		}
		
	}
	
	public void clearVehicles() {
		
		vehicles.clear();
		System.out.println("Vehicles have been removed from garage");
		
	}
	
	
}
	
	
