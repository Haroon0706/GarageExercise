package com.qa.garageexercise;

public class Vehicle {
	
	private String make;
	private int noOfWheels;
	private int iD;
	private boolean hasScratches;
	
	
	
	
	public Vehicle(String make, int noOfWheels, int iD, boolean hasScratches) {
		super();
		this.make = make;
		this.noOfWheels = noOfWheels;
		this.iD = iD;
		this.hasScratches = hasScratches;
	}




	public String getMake() {
		return make;
	}




	public void setMake(String make) {
		this.make = make;
	}




	public int getNoOfWheels() {
		return noOfWheels;
	}




	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}




	public int getiD() {
		return iD;
	}




	public void setiD(int iD) {
		this.iD = iD;
	}




	public boolean isHasScratches() {
		return hasScratches;
	}




	public void setHasScratches(boolean hasScratches) {
		this.hasScratches = hasScratches;
	}
	
	
	public float calcBill() {
		
		float totalBill = 150;
		
		if (hasScratches) {
			totalBill += 250;
			
		}
		
		totalBill += (noOfWheels * 10);
		
		return totalBill;
		
	}

}
