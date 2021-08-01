package collections;

public class SumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void sumElements() {
		int sum = 0;
		int elements[] = {1,2,3};
		for(int i : elements) {
			sum+= i;
		}
		System.out.println(sum);
	}

}
