package week2.day1;

import java.util.Arrays;

public class MissingElementInrray {

	public static void main(String[] args) {
		// Here is the input -int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	

		// loop through the array (start i from arr[0] till the length of the array)

		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration

		int[] arr = {1,2,3,4,7,6,8};

		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); 


		for (int i = 0; i < n; i++) {	
			int j = i+1;
			if (arr[i]!=j) {
				System.out.println("Missing element is :"+j);
				break;
			}
		}
	}



}

