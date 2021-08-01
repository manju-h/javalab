package general;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		//How to remove Whitespaces from String
		
		//How to remove leading and trailing whitespaces from a string?
		removeWhiteSpacesTrim("");
		removeWhiteSpacesStrip("");
	}

	public static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();

		char[] charArray = input.toCharArray();

		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}

		return output.toString();
	}

	/**
	 * Java String class contains two methods to remove leading and trailing
	 * whitespaces – trim(), and strip(). The strip() method was added to the String
	 * class in Java 11. However, the strip() method uses Character.isWhitespace()
	 * method to check if the character is a whitespace. This method uses Unicode
	 * code points whereas the trim() method identifies any character having
	 * codepoint value less than or equal to ‘U+0020’ as a whitespace character.
	 * 
	 * The strip() method is the recommended way to remove whitespaces because it
	 * uses the Unicode standard.
	 */

	public static void removeWhiteSpacesTrim(String input) {
		String s = "  abc  def\t";

		s = s.trim();

		System.out.println(s);
	}

	public static void removeWhiteSpacesStrip(String input) {
		String s = "  abc  def\t";

		s = s.strip();

		System.out.println(s);
	}
}
