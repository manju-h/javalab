package general;

import java.util.List;

public class CheckOddEven {
	public static void main(String[] args) {

	}

///Traditional
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}
		return true;
	}
	
	//Functional
	public static boolean onlyOddNumbers_Functional(List<Integer> list) {
		return list
				.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}
	//If the list is huge, we can use parallel stream for faster processing.
	public static boolean onlyOddNumbers_Parallel(List<Integer> list) {
		return list
				.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}
}