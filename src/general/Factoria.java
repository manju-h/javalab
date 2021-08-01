package general;

public class Factoria {
	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}
}

