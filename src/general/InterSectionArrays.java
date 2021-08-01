package general;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterSectionArrays {

	public static void firstmethod() {

		int[] array1 = { 0 ,  1 , 2 ,  3 ,  4  ,  5  };
		int[] array2 = {  4 ,  7 , 8 , 9 , 10 , 1 };
		int[] commonelement;
		for(int i : array1) {
			for(int j : array2) {
				if(i==j) {
					System.out.println(i);
				}
			}
		}
	 
	}
	
	public static void main(String[] args) {
		firstmethod();
	}
}
