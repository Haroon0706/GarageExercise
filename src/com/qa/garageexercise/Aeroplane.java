package com.qa.garageexercise;

public class Aeroplane extends Vehicle{
	
	public int noOfEngines;
	public int noOfFloors;
	
	
	
	
	public Aeroplane(String make, int noOfWheels, int iD, boolean hasScratches, int noOfEngines, int noOfFloors) {
		super(make, noOfWheels, iD, hasScratches);
		this.noOfEngines = noOfEngines;
		this.noOfFloors = noOfFloors;
	}


	public int getNoOfEngines() {
		return noOfEngines;
	}




	public void setNoOfEngines(int noOfEngines) {
		this.noOfEngines = noOfEngines;
	}




	public int getNoOfFloors() {
		return noOfFloors;
	}




	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	
	
	@Override
	public float calcBill() {
		
		float totalBill = 150;
		
		if (noOfEngines > 2) {
			
			totalBill += 4000;
			
		
		} else {
			
			totalBill += 2000;
			
		}
		
		if (noOfFloors > 1) {
			
			totalBill += 3000;
			
		} else {
			
			totalBill+= 1000;
		}
		
		return totalBill;
	}
	

}
