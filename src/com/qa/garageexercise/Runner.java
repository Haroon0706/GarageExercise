package com.qa.garageexercise;

public class Runner {
	
	public static void main(String[] args) {
		
		Garage firstGarage = new Garage();
		
		Truck T1 = new Truck("Scania", 16, 1, false, 2000.00f, "Diesel");
		
		Motorbike M1 = new Motorbike("Suzuki", 2, 2, true, "Gold", true);
		
		Aeroplane A1 = new Aeroplane("Boeing", 8, 3, true, 8, 2);
		
		firstGarage.addVehicle(T1);
		firstGarage.addVehicle(M1);
		firstGarage.addVehicle(A1);
		
		firstGarage.listVehicles();
		
		firstGarage.fixingVehicle(T1);
		firstGarage.fixingVehicle(M1);
		firstGarage.fixingVehicle(A1);
		
		firstGarage.removeVehicle("Suzuki");
		
		firstGarage.clearVehicles();
		
	}

}
