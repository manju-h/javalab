package collections.comparingexample;

import java.util.*;

public class ArrayListSortComparable {
	public static void main(String args[]) {

		ArrayList<StudentComparable> arraylist = new ArrayList<StudentComparable>();
		arraylist.add(new StudentComparable(222, "Messi", 29));
		arraylist.add(new StudentComparable(333, "Ronaldo", 31));
		arraylist.add(new StudentComparable(111, "john", 23));

		Collections.sort(arraylist);

		for (StudentComparable str : arraylist) {
			System.out.println(str);
		}
	}
}