package com.cg.foreach.changeindex;

/**
 * ц╟ещеепР
 * 
 * @author IYFT
 *
 */
public class ArraySort1 {

	public static void main(String[] args) {

		int[] arr = { 3, 82, 3142, 232, 12, 88, 900999 };

		/*
		 * int count= 0; int temp; for (int i = 0; i < arr.length; i++) { for (int j =
		 * 0; j < arr.length-i-1; j++) { count++;
		 * 
		 * if (arr[j] < arr[j+1]) { temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp; }
		 * } } System.out.println("total count >> "+count); for (int i = 0; i <
		 * arr.length; i++) { System.out.println(arr[i]); }
		 */

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] > arr[k]) {
					temp = arr[k];
					arr[k] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}