package general;

import java.util.*;
import java.io.*;

public class Anagram {
	public static void main(String[] args) throws java.lang.Exception {
		boolean result = isAnagram("now", "own");
		System.out.println(result);
	}

	/*
	 * 1. Convert the two strings into uppercase and remove all white spaces. 2.
	 * Convert the two strings into char arrays using toCharArray(). 3. Sort the two
	 * character arrays using sort() method of java.util.Arrays class. 4. After
	 * sorting, we compare both the arrays using equals() method.
	 */
	public static boolean isAnagram(String first, String second) {
		// remove all whitespaces and convert strings to lowercase
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "").toLowerCase();

		/*
		 * check whether string lengths are equal or not, if unequal then not anagram
		 */
		if (first.length() != second.length())
			return false;

		// convert string to char array
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();

		// sort both the arrays
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);

		// checking whether both strings are equal or not
		return Arrays.equals(firstArray, secondArray);
	}

	/**
	 * 1. In this method we go on checking whether each character of first string is
	 * present in second string. 2. If the character is present in second string, we
	 * remove the character from the second string, and proceed to the next
	 * character of first string. 3. If any character of first string is not present
	 * in second string, we break the loop and result would be first string is not
	 * anagram of second string.
	 */
	public static boolean isAnagram_charway(String first, String second) {
		// remove all whitespaces and convert strings to lowercase
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "").toLowerCase();

		/*
		 * check whether string lengths are equal or not, if unequal then not anagram
		 */
		if (first.length() != second.length())
			return false;

		// convert first string to char array
		char[] firstArray = first.toCharArray();

		// check whether each character of firstArray is present in second string
		for (char c : firstArray) {
			int index = second.indexOf(c);

			// indexOf function returns -1 if the character is not found
			if (index == -1)
				return false;

			// if character is present in second string, remove that character from second
			// string
			second = second.substring(0, index) + second.substring(index + 1, second.length());
		}
		return true;
	}
}