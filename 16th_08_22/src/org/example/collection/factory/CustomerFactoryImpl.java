package org.example.collection.factory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.example.collection.model.Customer;

public class CustomerFactoryImpl implements CustomerFactory{
	
	private Map<Integer, Customer> customers=null;
	
	
	{
		customers=new HashMap<Integer,Customer>();
	}

	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customers.put(new Random().nextInt(1000), customer);
		System.out.println("customer added sucessfully...!"+customers);
		
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customers.values();
	}

}
