package general;

public class ReverseString {

	public static void main(String[] args) {
		String str = "123";

		// BuilderWay
		StringBuilder strBuild = new StringBuilder(str);
		System.out.println(strBuild.reverse());

		// Char way
		StringBuilder out = new StringBuilder();
		char[] chars = str.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		System.out.println(out.toString());
	}

}
