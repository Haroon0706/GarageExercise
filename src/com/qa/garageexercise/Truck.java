package com.qa.garageexercise;

public class Truck extends Vehicle{
	
	
	public float weight;
	public String fuel;
	
	
	
	public Truck(String make, int noOfWheels, int iD, boolean hasScratches, float weight, String fuel) {
		super(make, noOfWheels, iD, hasScratches);
		this.weight = weight;
		this.fuel = fuel;
	}


	public float getWeight() {
		return weight;
	}



	public void setWeight(float weight) {
		this.weight = weight;
	}



	public String getFuel() {
		return fuel;
	}



	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	
	@Override
	public float calcBill() {
		
		float totalBill = 150;
		
		if (weight >= 1000) {
			
			totalBill += weight * 0.5;
			
			
		} else { 
			
			totalBill += weight * 0.25;
			
			
		}
		
		if (fuel == "Diesel") {
			
			totalBill = totalBill/2;
			
		} else {
			
			totalBill = totalBill*1.5f;
		}
		
		return totalBill;
	}
	

}
	
	
