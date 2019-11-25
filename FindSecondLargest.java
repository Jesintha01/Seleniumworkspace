package day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		int i;
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the last but one and print
		 */
		Arrays.sort(data);
		// Print the second largest number	
		/*for(i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}*/
		System.out.println("Second largest number is " + data[data.length-2]);
		
	}

}
