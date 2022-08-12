package org.example.main;

import java.util.Random;

import org.example.model.CD;
import org.example.model.Employee;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;

public class App {

	public static void main(String[] args) {

		// dynamic method dispatching
		
		  CD cd=new InternationalCD("French", 100, "Godzila", 10000);
		  System.out.println(cd+"\n==============\n"); 
		  cd=new SpecialEditionCD(101, "Titanic", 2001, "3D");
		  
		  System.out.println(cd);
		 
		Employee employee=new Employee(new Random().nextInt(1000), "John Doe", 200000);
		System.out.println(employee);

	}

}
