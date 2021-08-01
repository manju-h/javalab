package general;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;

		b = b + a; // now b is sum of both the numbers
		a = b - a; // b - a = (b + a) - a = b (a is swapped)
		b = b - a; // (b + a) - b = a (b is swapped)
		 
		
	}

}
