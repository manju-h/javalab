package general;

public class SecondLargest {

	public static void main(String[] args) {
		int elements[] = { 43, 2, 15, 55, 67, 3 };

		// one way
		findSecondHighest(null);

		// sort way
		/*
		 * We can sort the array in natural ascending order and take the second last
		 * value. But, sorting is an expensive operation.
		 */
	}

	private static int findSecondHighest(int[] array) {

		int secondhigh = 0;
		int highest = 0;

		for (int i : array) {
			if (i > highest) {
				secondhigh = highest;
				highest = i;
			} else if (i > secondhigh) {
				secondhigh = i;
			}
		}

		System.out.println(secondhigh);
		return secondhigh;
	}

}
