package general;

public class CheckPrime {
	public static void main(String[] args) {

		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(49)); // false
	}

	
	//Not very efficient way of doing
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
	
	 static boolean isPrimeNumber(int n)
	    {
	 
	        // Check if number is less than
	        // equal to 1
	        if (n <= 1)
	            return false;
	 
	        // Check if number is 2
	        else if (n == 2)
	            return true;
	 
	        // Check if n is a multiple of 2
	        else if (n % 2 == 0)
	            return false;
	 
	        // If not, then just check the odds
	        for (int i = 3; i <= Math.sqrt(n); i += 2)
	        {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }
}
