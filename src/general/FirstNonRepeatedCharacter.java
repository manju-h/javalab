package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/*
 *  How to find the first non repeated character in the String? 
 */
public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String input1 = "Alive is awesome";
		String unqueinput = "Alive swum";

	}

	/**
	 * 1. Create a HashSet object. 2. Scan the whole string, and add each character
	 * one by one to the HashSet object 3. If the add object returns true then
	 * continue else return false
	 */
	public static boolean usingSet(String inputstring) {
		boolean result = false;
		HashSet<Character> uniquecharset = new HashSet();
		for (int i = 0; i < inputstring.length(); i++) {
			result = uniquecharset.add(inputstring.charAt(i));
			if (result == false)
				break;
		}
		return result;
	}

	public static boolean usingIndexOfLastIndexOf(String input) {
		boolean result = false;
		for (char ch : input.toCharArray()) {
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				result = true;
			else {
				result = false;
				break;
			}
		}
		return result;
	}



	public static boolean usingIndexOf(String input) {
		ArrayList ar = new ArrayList();
		for (int i = 0; i < input.length(); i++) {
			int j = input.indexOf(input.charAt(i));
			ar.add(j);
		}
		Collections.sort(ar);
		for (int i = 0; i < (ar.size() - 1); i++) {
			if (ar.get(i) == ar.get(i + 1))
				return false;
		}
		return true;
	}
}
