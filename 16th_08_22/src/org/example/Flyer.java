package org.example;

public abstract class Flyer {
	public abstract void fly();
	public abstract void takeOff();
	public abstract void land();
	public String getDetails()
	{
		return "details of flyer goes here";
	}

}
