package com.qa.garageexercise;

public class Motorbike extends Vehicle{
	
	
	public String colour;
	public boolean spokesIntact;
	
	
	
	public Motorbike(String make, int noOfWheels, int iD, boolean hasScratches, String colour, boolean spokesIntact) {
		super(make, noOfWheels, iD, hasScratches);
		this.colour = colour;
		this.spokesIntact = spokesIntact;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public boolean isSpokesIntact() {
		return spokesIntact;
	}



	public void setSpokesIntact(boolean spokesIntact) {
		this.spokesIntact = spokesIntact;
	}
	
	
	@Override
	public float calcBill() {
		
		float totalBill = 150;
		
		if (colour == "Gold") {
			
			totalBill += 1000;
			
			
		} else {
			
			totalBill += 500;
			
		}
		
		if (spokesIntact) {
			
			totalBill -= 250;
			
		} else {
			
			totalBill += 500;
		}
	
		return totalBill;
		
	}

}
