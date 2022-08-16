package org.example.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.example.collection.model.Employee;
import org.example.collection.model.SalaryComparator;

public class App {

	public static void main(String[] args) {

		/*
		 * Set<Integer> set = new HashSet<Integer>(); set.add(10); set.add(20);
		 * set.add(10); set.add(1); set.add(30); //printing entire set
		 * System.out.println(set);
		 * 
		 * //retriving indivisual values from set using iterator
		 * 
		 * Iterator<Integer> i=set.iterator();
		 * 
		 * while(i.hasNext()) { System.out.println(i.next()); } //using enhanched for
		 * loop for(Integer s:set) { System.out.println(s); }
		 * 
		 * // set.forEach(MyClass::display);
		 * 
		 * 
		 * 
		 * List<Integer> list=new ArrayList<Integer>(); list.add(10); list.add(20);
		 * list.add(-9); list.add(2); list.add(0); System.out.println(list);
		 * list.forEach(System.out::println);
		 * 
		 * Map<Integer, String> map=new HashMap<Integer,String>(); map.put(1, "Sachin");
		 * map.put(2, "John"); map.put(3, "Marry"); map.put(3, "Sourav");
		 * System.out.println(map); Collection<String> collection= map.values();
		 * System.out.println(collection); collection.forEach(System.out::println);
		 * Set<Integer> set1= map.keySet(); System.out.println(set1);
		 * set1.forEach(System.out::println); Set<Entry<Integer, String>> set2=
		 * map.entrySet(); System.out.println(set2); set2.forEach(System.out::println);
		 * 
		 * 
		 */
		
		Set<Integer> s=new TreeSet<Integer>();
		s.add(10);
		s.add(1);
		s.add(19);
		s.add(-8);
		
		s.forEach(System.out::println);
		
		Comparator<Employee> comparator=new SalaryComparator();
		Set<Employee> employees=new TreeSet<Employee>(comparator);
	
		employees.add(new Employee(1, "John",10000));
		employees.add(new Employee(2, "Sourav", 9000));
		employees.add(new Employee(3, "Marry", 19000));
		employees.add(new Employee(4, "Rahul", 40000));
		
		employees.forEach(System.out::println);
		
	}

}
