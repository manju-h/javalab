package general;

public class RemoveOccurences {

	private void removeOccurences() {
		String str1 = "abcdABCDabcdABCD";
		str1 = str1.replace("a", "");
		System.out.println(str1); // bcdABCDbcdABCD

	}

	public static void main(String[] args) {

	}
}
