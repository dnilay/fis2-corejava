package org.example;

public abstract class Vehicle {
	private String vehicleNumber;
	private double fuelConsumed;
	private double start;
	private double end;
	public abstract double calculateFuelEfficiency();
	public abstract double calculateTripDistance();
	

	
	public String displayDetails()
	{
		return "null";
	}
	

}
