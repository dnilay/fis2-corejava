package org.example;

public class App {

	public static void main(String[] args) {
		
		
		/*
		 * Vehicle vehicle=new Truck(); vehicle=new RiverBerge();
		 * 
		 * //annonimous inner class Vehicle vehicle2=new Vehicle() {
		 * 
		 * @Override public double calculateFuelEfficiency() { // TODO Auto-generated
		 * method stub return 0; }
		 * 
		 * @Override public double calculateTripDistance() { // TODO Auto-generated
		 * method stub return 0; } };
		 */
		Flyer bird=new Bird();
		Flyer superMan= new Flyer() {
			
			@Override
			public void takeOff() {
				// TODO Auto-generated method stub
				System.out.println("superman taking-off");
				
			}
			@Override
			public void land() {
				// TODO Auto-generated method stub
				System.out.println("superman landing");
				
			}
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("superman flying");
				
			}
		};
		System.out.println(bird);
		System.out.println(superMan);
		superMan.takeOff();
		superMan.fly();
		superMan.land();
		
		

	}

}
