package org.example.collection.main;

import java.util.Collection;
import java.util.Scanner;

import org.example.collection.factory.CustomerFactory;
import org.example.collection.factory.CustomerFactoryImpl;
import org.example.collection.model.Customer;

public class Tester {

	private static  CustomerFactory customerFactory=null;

	private static Scanner scanner=new Scanner(System.in);
	static {
		customerFactory = new CustomerFactoryImpl();
	}

	public static void main(String[] args) {
		
		
		String name,address,email=null;
		int choice=0;
		
		do {
			System.out.println("1. Create Customer.");
			System.out.println("2. Display All Available Customer. ");
			System.out.println("0. Exit. ");
			System.out.print("Enter your choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Name: ");
				name=scanner.next();
				System.out.print("Enter Address: ");
				address=scanner.next();
				System.out.println("Enter Email: ");
				email=scanner.next();
				customerFactory.createCustomer(new Customer(name, address, email));
				break;
				
			case 2:
				Collection<Customer> collection=customerFactory.getAllCustomers();
				collection.forEach(System.out::println);
				break;
				
			case 0:
				System.out.println("Bye...!");
				System.exit(0);
				
			default:
				System.out.println("Invalid choice...!");
				break;
			}
		} while (choice!=0);
		
		

	}

}
