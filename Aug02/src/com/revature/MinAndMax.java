package com.revature;

public class MinAndMax {
	
	public static void MinMax(int[] arr){
		int min = arr[0];
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Minimum: " + min + "\nMaximum: " + max);
	}

}
