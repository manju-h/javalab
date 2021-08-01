package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Excercise1 {

	// Write a program to convert List to Array.
	public static void listtoArray(List courses) {
		// example 1
		String[] arrayCourses = (String[]) courses.toArray(new String[courses.size()]);

		// example 2
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Boston");
		cities.add("Dallas");
		cities.add("San jose");
		cities.add("Chicago");

		/* ArrayList to Array Conversion */
		String citinames[] = cities.toArray(new String[cities.size()]);

	}

	// Write a program to traverse(or iterate) HashSet?
	public static void iterateHashSet() {
		Set<String> hashset = new HashSet<String>();
		// Add elements to HashSet
		hashset.add("Pear");
		hashset.add("Apple");
		hashset.add("Orange");
		hashset.add("Papaya");
		hashset.add("Banana");

		// old
		Iterator<String> it = hashset.iterator();
		while (it.hasNext()) {
			it.next();
		}
		// Enhanced for loop
		for (String str : hashset) {
			System.out.println(str);
		}
		// Java 8
		hashset.stream().forEach(System.out::println);

	}

	// Given an element write a program to check if element(value) exists in
	// ArrayList?
	public static void searchElement() {
		// initialize ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		// add elements to ArrayList object
		al.add(3);
		al.add(17);
		al.add(6);
		al.add(9);
		al.add(7);
		// check if ArrayList contains element
		if (al.contains(7)) {
			System.out.println("7 was found in the list");
		} else {
			System.out.println("7 was not found in the list");
		}
	}

	/*
	 * Q8 Write a program to convert Array to List? (Solution) Array can be
	 * converted to list using Arrays.asList() method.
	 */

	/*
	 * Q15 How to check if HashMap is empty? (Solution)
	 * 
	 * You can check if HashMap is empty using isEmpty() method.
	 */

	/*
	 * Q16 Write a program to iterate the HashMap ?
	 * 
	 */

	public static void iterateHashMap() {
		
	}

	/**
	 * 
	 * public static void xyz() { }
	 * 
	 **/
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		listtoArray(courses);
	}
}
