package general;

import java.util.HashSet;

public class GuessOutPut {

	public static void main(String[] args) {
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
		/*
		 * Explanation: The given statements output will be “ourn”. First character will
		 * be automatically type caste to int. After that since in java first character
		 * index is 0, so it will start from ‘o’ and print till ‘n’. Note that in String
		 * substring function it leaves the end index.
		 */

		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());
		/*
		 * Output: 100
		 * 
		 * Explanation: The size of the shortSet will be 100. Java Autoboxing feature
		 * has been introduced in JDK 5, so while adding the short to HashSet<Short> it
		 * will automatically convert it to Short object. Now “i-1” will be converted to
		 * an int while evaluation and after that it will autoboxed to Integer object
		 * but there is no Integer object in the HashSet, so it will not remove anything
		 * from the HashSet and finally its size will be 100.
		 */

		//// What will be the boolean “flag” value to reach the finally block?
		boolean flag = false;
		try {
			if (flag) {
				while (true) {
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}
		/*
		 * Explanation: The finally block will never be reached here. If flag will be
		 * TRUE, it will go into an infinite loop and if it’s false it’s exiting the
		 * JVM. So finally block will never be reached here.
		 */

		String str = null;
		String str1 = "abc";
		System.out.println(str1.equals("abc") | str.equals(null));

		/*
		 * Output: NullPointerException
		 * 
		 * Explanation: The given print statement will throw
		 * java.lang.NullPointerException because while evaluating the OR logical
		 * operator it will first evaluate both the literals and since str is null,
		 * .equals() method will throw exception. Its always advisable to use short
		 * circuit logical operators i.e “||” and “&&” which evaluates the literals
		 * values from left and since the first literal will return true, it will skip
		 * the second literal evaluation.
		 */
	}

}
