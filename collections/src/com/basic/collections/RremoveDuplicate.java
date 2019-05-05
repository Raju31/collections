package com.basic.collections;

import java.util.Arrays;

@SuppressWarnings("unused")
public class RremoveDuplicate {
	public static void main(String[] args) {
		
		 /* int arr[] = {10,70,30,90,20,20,30,40,70,50};
		unsorted array int arr[] ={-1,-2-9,-8,3,6,4}; 
		Arrays.sort(arr);
		sorting array int length = arr.length;
		  printing array elements for (int i=0; i<length; i++)
		  System.out.print(arr[i]+" ");
		 */
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 7,101,101 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count <= 1) {
				System.out.print(a[i] + " ");
			}

		}
	}

}
