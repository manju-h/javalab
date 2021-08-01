package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDescending {
	public static void main(String args[]) {
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(13);
		intlist.add(89);
		intlist.add(45);
		sortReverseUsingCollections_2(intlist);
		
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Apple");
		arraylist.add("Banana");
		arraylist.add("Pear");
		arraylist.add("Mango");
		sortReverseUsingCollectionsArrayList(arraylist);
		
	}

	private static void sortReverseUsingCollections_2(ArrayList<Integer> inputlist) {
		Collections.sort(inputlist);
		Collections.reverse(inputlist);
		for (Integer i : inputlist) {
			System.out.println(i);
		}
	}

	public static void sortReverseUsingCollectionsArrayList(ArrayList<String> arraylist) {

		/* Unsorted List: ArrayList content before sorting */
		System.out.println("ArrayList Before Sorting:");
		for (String str : arraylist) {
			System.out.println(str);
		}

		/* Sorting in decreasing (descending) order */
		Collections.sort(arraylist, Collections.reverseOrder());
		/* Sorted List in reverse order */
		System.out.println("ArrayList in descending order:");
		for (String str : arraylist) {
			System.out.println(str);
		}
	}

}