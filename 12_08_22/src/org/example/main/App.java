package org.example.main;

import org.example.model.CD;
import org.example.model.Employee;
import org.example.model.InternationalCD;
import org.example.model.SpecialEditionCD;

public class App {
	
	
	public static void approvedLeave(Employee employee)
	{
		
	}
	public static void checkObject(CD cd)
	{
		CD tempCD=null;
		if(cd instanceof SpecialEditionCD)
		{
			tempCD=(SpecialEditionCD)cd;
			System.out.println("special edition cd:"+tempCD);
		}
		else if(cd instanceof InternationalCD)
		{
			tempCD=(InternationalCD)cd;
			System.out.println("international cd: "+tempCD);
		}
	}

	public static void main(String[] args) {

		// dynamic method dispatching

		/*
		 * CD cd=new InternationalCD("French", 100, "Godzila", 10000);
		 * System.out.println(cd+"\n==============\n"); cd=new SpecialEditionCD(101,
		 * "Titanic", 2001, "3D");
		 * 
		 * System.out.println(cd);
		 */

		/*
		 * Employee employee = new Employee(1, "John Doe", 200000); Employee employee1 =
		 * new Employee(1, "John Doe", 200000); System.out.println(employee ==
		 * employee1); System.out.println(employee); System.out.println(employee1);
		 * System.out.println(employee.equals(employee1));
		 */
		
		
		
		CD cd1=new InternationalCD("French", 1, "mycd-1", 1000);
		CD cd2=new SpecialEditionCD(2,"mycd-2",200,"3D");
		checkObject(cd2);
		
		

	}

}
