package week2.day1;

import java.util.Arrays;


/*
 Pseudo Code:
 1) Arrange the array in ascending order
 2) Pick the 2nd element from the last and print it
 */

public class SecondLargest_Array {
	
	
	//using sort

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int n = data.length;
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		int sec = data[n-2];
		System.out.println(sec);


	}

}
